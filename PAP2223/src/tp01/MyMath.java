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

	public static DataPhi calculPhi(double prec) {
		assert prec > 0 && prec <= 1 : " La précision doit être <0 et <=1";
		double phi = (1 + Math.sqrt(5)) / 2;
		double f0 = 1;
		double f1 = 1;
		double f2;
		int n = 2;
		while (Math.abs(phi - f1 / f0) > prec) {
			f2 = f1 + f0;
			f0 = f1;
			f1 = f2;
			n++;
		}
		return new DataPhi(n, f1 / f0);
	}

	/**
	 * Calcule le nombre de bits à 1 dans n
	 * 
	 * @param n
	 * @return nombre de bits à 1 dans n
	 */
	public static byte nbBitsV1Bis(int n) {
		int m = 1; // masque 1
		int w = -1; // masque 2
		byte cpt = 0;
		while ((n & w) != 0) {
			if ((n & m) != 0)
				cpt++;
			m = m << 1;
			w = w << 1;
		}
		return cpt;
	}

	public static void main(String[] args) {
		DataPhi d = calculPhi(0.000001);
		System.out.println(d.n() + " : " + d.phi());

		/*
		 * System.out.println("Entrez un nombre: "); Scanner console = new
		 * Scanner(System.in); int n = console.nextInt(); System.out.println(n +
		 * " est pair :" + estPair(n)); console.close();
		 */
	}
}
