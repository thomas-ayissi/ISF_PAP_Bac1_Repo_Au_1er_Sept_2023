package tp01;

import java.util.Scanner;

/**
 * 
 * @author Didier VO
 *
 */
public class MyMath {

	/**
	 * Vérifie si le nombre est pair
	 * 
	 * @param n entier >=0
	 * @return true si pair
	 */
	public static boolean estPair(int n) {
		assert n >= 0 : "n doit être un entier >=0";
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		System.out.println("Entrez un nombre: ");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		System.out.println(n + " est pair :" + estPair(n));
		console.close();
			}
}
