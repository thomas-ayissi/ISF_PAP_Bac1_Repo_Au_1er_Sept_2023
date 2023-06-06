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
		boolean[][] trans = { { true, false, true, true, false, false, true, false, true, true },
				{ false, true, false, true, true, false, true, false, true, true },
				{ true, false, true, false, true, false, true, false, true, true },
				{ true, true, false, false, false, false, true, false, true, true },
				{ true, false, true, true, false, false, true, false, true, true },
				{ true, false, true, true, false, false, true, false, true, true },
				{ true, false, true, true, false, false, true, false, true, true },
				{ true, false, true, true, false, false, true, false, true, true },
				{ true, false, true, true, false, false, true, false, true, true },
				{ true, false, true, true, false, false, true, false, true, true } };
		int[] seq1 = { 0, 0, 2, 2, 0, 1 };// false
		int[] seq2 = { 0, 2, 1, 1, 3 };// false
		int[] seq3 = { 0, 0, 2, 2, 0, 3 };// true
		int[] seq4 = { 0 };// true
//		System.out.println("Seq valide: " + validerSeq(seq1, trans));
//		System.out.println("Seq valide: " + validerSeq(seq2, trans));
//		System.out.println("Seq valide: " + validerSeq(seq3, trans));
//		System.out.println("Seq valide: " + validerSeq(seq4, trans));
	}

}
