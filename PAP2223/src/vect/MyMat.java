package vect;

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
	
	public static int[][] initPacale(int n){
		int[][] m= new int[n][n];
		
		
		return m;
	}
	
	

}
