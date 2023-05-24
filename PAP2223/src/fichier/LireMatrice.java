package fichier;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import vect.MyMat;

public class LireMatrice {
	public static void main(String[] args) {
		// Permet d'obtenir l'URL d'un fichier qui se trouve dans un package de
		// l'application (chemin absolu)
		URL url = LireMatrice.class.getResource("mat1.txt");
		if (url == null)
			System.err.println("Le fichier n'existe pas");
		else {//Crée un fichier à partir du chemin contenu dans l'URL
			File fichier = new File(url.getFile());
			try (Scanner scan = new Scanner(fichier)) {
				int nbLignes = scan.nextInt();
				int nbColonnes = scan.nextInt();
				System.out.println("NbLignes: " + nbLignes + " NbColonnes: " + nbColonnes);
				//Crée la matrice
				int[][] mat = new int[nbLignes][nbColonnes];

				for (int i = 0; i < nbLignes; i++)
					for (int j = 0; j < nbColonnes; j++)
						mat[i][j] = scan.nextInt();

				MyMat.afficheM1(mat);

			} catch (FileNotFoundException e) {
				System.err.println("Erreur " + e.getMessage());
			}
		}

	}
}
