package fichier;

import java.util.Scanner;

import vect.MyMat;

public class LireMatrice {
	public static void main(String[] args) {
		// Permet d'obtenir l'URL d'un fichier qui se trouve dans un package de
		// l'application (chemin absolu)
		
			try (Scanner scan = new Scanner(LireMatrice.class.getResourceAsStream("mat11.txt"))) {
				int nbLignes = scan.nextInt();
				int nbColonnes = scan.nextInt();
				System.out.println("NbLignes: " + nbLignes + " NbColonnes: " + nbColonnes);
				//Crée la matrice
				int[][] mat = new int[nbLignes][nbColonnes];

				for (int i = 0; i < nbLignes; i++)
					for (int j = 0; j < nbColonnes; j++)
						mat[i][j] = scan.nextInt();

				MyMat.afficheM1(mat);

			} catch (Exception e) {
				System.err.println("Erreur " + e.getMessage());
			}
		}

	
}
