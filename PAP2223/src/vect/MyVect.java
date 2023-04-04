package vect;

public class MyVect {

	public static void afficheV(int[] v) {
		System.out.print('[');
		for (int i = 0; i < v.length - 1; i++)
			System.out.print(v[i] + ",");
		if (v.length != 0)
			System.out.print(v[v.length - 1]);
		System.out.println(']');
	}

	/**
	 * Somme les éléments du vecteur
	 * 
	 * @param v
	 * @return la somme
	 */
	public static long sommeV(int[] v) {
		long somme = 0;
		for (int e : v)
			somme = somme + e;
		return somme;
	}

	/**
	 * Vérifie si un élement existe dans le vecteur
	 * 
	 * @param v
	 * @param elem
	 * @return true si elem existe dans V
	 */
	public static boolean existInV(int[] v, int elem) {
		boolean trouve = false;
		int i = 0;
		while (i < v.length && !trouve) {
			trouve = v[i] == elem;
			i++;
		}

		return trouve;
	}

	/**
	 * Clone un vecteur
	 * 
	 * @param v1
	 * @return la copie de v1
	 */
	public static int[] cloneV(int[] v1) {
		int[] v2 = new int[v1.length];
		for (int i = 0; i < v1.length; i++)
			v2[i] = v1[i];
		return v2;
	}

	/**
	 * Vérifie si un vecteur est trie
	 * 
	 * @param v
	 * @return
	 */
	public static boolean estTrie(int[] v) {

		// TODO
		return true; // A changer
	}

	/**
	 * Inverse le contenu d'un vecteur
	 * 
	 * @param v le vecteur qui sera modifié
	 */
	public static void inverseV(int[] v) {

	}

	public static void main(String[] args) {
		int[] v1 = {};
		int[] v2 = { 2, 8, 11, 67, 4 };
		afficheV(v1);
		afficheV(v2);

	}

}
