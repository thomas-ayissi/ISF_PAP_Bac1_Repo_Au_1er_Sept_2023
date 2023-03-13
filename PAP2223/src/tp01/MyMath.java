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

	/**
	 * Calcule le Nème nombre de Fibonacci
	 * 
	 * @param n >=0
	 * @return Fn
	 */
	public static int fibo(int n) {
		assert n >= 0 : "Le nombre doit être >=0";
		int f0 = 0;
		int f1 = 1;
		int f2 = n;
		for (int i = 2; i <= n; i++) {
			f2 = f1 + f0;
			f0 = f1;
			f1 = f2;
		}
		return f2;
	}

	public static void main(String[] args) {
		System.out.println("Entrez un nombre: ");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		System.out.println(n + " est pair :" + estPair(n));
		console.close();
	}
}
