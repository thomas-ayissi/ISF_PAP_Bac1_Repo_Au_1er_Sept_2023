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
	public static boolean estTrieV1(int[] v) {
		assert v.length > 0 : "Le vecteur ne peut pas être vide";
		int i = 0;
		int l = v.length - 1;
		while (i < l && v[i] <= v[i + 1])
			i++;

		return i == l;
	}

	/**
	 * Vérifie si un vecteur est trie
	 * 
	 * @param v
	 * @return
	 */
	public static boolean estTrieV2(int[] v) {
		assert v.length > 0 : "Le vecteur ne peut pas être vide";
		int i = 0;
		int l = v.length - 1;
		boolean trie = true;
		while (i < l && trie) {
			trie = v[i] <= v[i + 1];
			i++;
		}
		return trie;
	}

	/**
	 * Inverse le contenu d'un vecteur
	 * 
	 * @param v le vecteur qui sera modifié
	 */
	public static void inverseV1(int[] v) {
		int fin = v.length / 2;
		int l = v.length - 1;
		int tmp;
		for (int i = 0; i < fin; i++) {
			tmp = v[i];
			v[i] = v[l - i];
			v[l - i] = tmp;
		}
	}

	/**
	 * Inverse le contenu d'un vecteur
	 * 
	 * @param v le vecteur qui sera modifié
	 */
	public static void inverseV2(int[] v) {
		int i = 0;
		int j = v.length - 1;
		int tmp;
		while (i < j) {
			tmp = v[i];
			v[i] = v[j];
			v[j] = tmp;
			i++;
			j--;
		}
	}

	/**
	 * Recherche binaire
	 * 
	 * @param v   vecteur trié (croissant)
	 * @param val valeur recherchée
	 * @return l'indice de l'élément ou -1
	 */
	public static int rechercheBin(int[] v, int val) {
		int a = 0;
		int b = v.length - 1;
		int m = b / 2;
		while (a < b && v[m] != val) {
			if (val < v[m])
				b = m - 1;
			else
				a = m + 1;
			m = (a + b) / 2;
		}
		return v[m] == val ? m : -1;
	}

	/**
	 * Trie le vecteur par insertion linéaire
	 * 
	 * @param v in/out vecteur à trier
	 */
	public static void triInsertion(int[] v) {
		int val;
		int i;
		for (int j = 1; j < v.length; j++) {
			val = v[j];
			i = j - 1;
			while (i >= 0 && v[i] > val) {
				v[i + 1] = v[i];
				i--;
			}
			v[i + 1] = val;
		}
	}

	/**
	 * Vérifie si un texte est un palindrome
	 * 
	 * @param v
	 * @return true si c'est un palindrome
	 */
	public static boolean estPalindrome(char[] v) {
		int i = 0;
		int j = v.length - 1;
		while (i < j && v[i] == v[j]) {
			i++;
			j--;
		}
		return i >= j; // ou v[i]==v[j]
	}

	public static void main(String[] args) {
		// int[] v1 = {};
		//int[] v2 = { 2, 12, 8, 11, 6, 1 };
		// afficheV(v1);
//		afficheV(v2);
//		System.out.println("Trié: " + estTrieV2(v2));
//		triInsertion(v2);
//		afficheV(v2);
//		System.out.println("Trié: " + estTrieV2(v2));
//		
		char[] v={'A','A'};
		System.out.println(estPalindrome(v));
	}

}
