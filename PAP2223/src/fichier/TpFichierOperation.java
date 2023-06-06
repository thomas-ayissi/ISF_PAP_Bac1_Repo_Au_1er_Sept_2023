package fichier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TpFichierOperation {
	/**
	 * Charge une liste d'opérations à partir d'un fichier
	 * 
	 * @param fichier
	 * @return list d'opérations
	 */
	public static List<Operation> loadOperations(String fichier) {
		// liste d'opérations
		List<Operation> operations = new ArrayList<>();
		// formatteur "jour/mois/année"
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

		try (Scanner scan = new Scanner(TpFichierOperation.class.getResourceAsStream(fichier))) {

			while (scan.hasNext()) {
				// Charge un vecteur avec le split de la ligne
				String[] mots = scan.nextLine().split(";");
				String qui = mots[0].trim().toUpperCase();
				String quoi = mots[1].trim();
				LocalDate date = LocalDate.parse(mots[2].trim(), formatter);
				double mt = Double.parseDouble(mots[3].trim());
				// Ajoute la nouvelle opération à la liste
				operations.add(new Operation(qui, quoi, date, mt));
			}

		} catch (Exception e) {
			System.err.println("Erreur: " + e.getMessage());
		}

		return operations;
	}

	/**
	 * Calcule pour chaque personne la somme des montants payés
	 * 
	 * @param liste liste d'opérations
	 * @return une map personne=>montant
	 */
	public static Map<String, Double> calculMtPers(List<Operation> liste) {
		// crée un dictionnaire String => Double
		Map<String, Double> map = new HashMap<>();
		for (Operation op : liste) {
			// récupère le montant de la personne
			// si la personne n'existe pas retourne 0.0
			// ajoute le montant de l'opération op
			Double s = map.getOrDefault(op.qui(), 0.0) + op.montant();
			// rajoute l'élément dans la map
			map.put(op.qui(), s);
		}
		return map;
	}

	public static void main(String[] args) {
		// Chargement d'une liste d'opérations à partir d'un fichier
		List<Operation> liste = loadOperations("operations.txt");
		// Affiche les opérations
		liste.forEach(op -> System.out.println(op));
		// Calcul le total par personne et l'affiche
		System.out.println(calculMtPers(liste));
	}

}
