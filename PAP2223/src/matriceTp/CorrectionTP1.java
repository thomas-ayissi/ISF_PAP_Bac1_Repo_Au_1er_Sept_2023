package matriceTp;

public class CorrectionTP1 {

	// Q1
	/**
	 * Recherche l'entier le plus petit dans la matrice
	 * 
	 * @param m la matrice
	 * @return le minimum
	 */
	public static int rechercheMin(int[][] m) {
		int min = m[0][0];
		int nbLignes = m.length;
		int nbColonnes = m[0].length;
		for (int i = 0; i < nbLignes; i++)
			for (int j = 0; j < nbColonnes; j++)
				if (m[i][j] < min)
					min = m[i][j];
		return min;
	}

	// Q2
	public static boolean existInMat(int[][] m, int elem) {
		boolean trouve = m[0][0] == elem;
		int nbLignes = m.length;
		int nbColonnes = m[0].length;
		int i = 0;
		do {
			int j = 0;
			do {
				trouve = m[i][j] == elem;
				j++;
			} while (!trouve && j < nbColonnes);
			i++;
		} while (!trouve && i < nbLignes);
		return trouve;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
