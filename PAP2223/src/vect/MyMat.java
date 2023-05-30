package vect;

import tp01.MyMath;

public class MyMat {
	/**
	 * Affiche la matrice sur la console
	 * 
	 * @param m
	 */
	public static void afficheM1(int[][] m) {
		for (int[] ligne : m) {
			for (int elem : ligne) {
				System.out.printf("%3d", elem);
			}
			System.out.println();
		}
	}

	/**
	 * Affiche la matrice sur la console
	 * 
	 * @param m
	 */
	public static void afficheM(int[][] m) {
		System.out.printf("%3s", "");
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("%3d", j);
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%2d ", i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%3d", m[i][j]);
			}
			System.out.println();
		}
	}
/**
 * Crée une matrice n*n
 * @param n
 * @return
 */
	public static int[][] initPascal(int n) {
		assert n > 1 : "n doit être >1";
		int[][] m = new int[n][n];
		for (int i = 0; i < n; i++)
			m[i][0] = m[0][i] = i;
		for (int i = 1; i < n; i++)
			for (int j = 1; j < n; j++)
				m[i][j] = m[i - 1][j - 1] + m[i - 1][j];
		return m;
	}

	public static void main(String[] args) {
		MyMat.afficheM1(initPascal(5));
	}

}
