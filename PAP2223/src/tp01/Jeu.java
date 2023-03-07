package tp01;

import java.util.Random;
import java.util.Scanner;

public class Jeu {
	public static void main(String[] args) {
		boolean stop;
		int n;
		int nbCoups;
		int secret;
		int nbParties = 0;
		int totalCoups = 0;
		String choix = "y";
		Scanner scan = new Scanner(System.in);
		// create instance of Random class
		Random rand = new Random();
		do {
			nbCoups = 0;
			nbParties++;
			secret = rand.nextInt(100) + 1;
			System.out.println("Tapez un nombre négatif pour quitter");
			System.out.println("SECRET: " + secret);
			do {
				System.out.println("Entrez un nombre entre 1 et 100");
				n = scan.nextInt();
				stop = n < 0;
				if (!stop) {
					nbCoups++;
					if (n < secret)
						System.out.println("Trop petit");
					else if (n > secret)
						System.out.println("Trop grand");
				}

			} while (n != secret && !stop);

			if (!stop) {
				totalCoups = totalCoups + nbCoups;
				System.out.println("Super tu l'as trouvé en " + nbCoups + (nbCoups == 1 ? " coup" : " coups"));
				System.out.printf("Ta moyenne est de %.2f en %d parties \n",1.0*totalCoups/nbParties,nbParties);
				System.out.print("Tapez (y) pour faire une autre partie: ");
				choix = scan.next();
			}

		} while (!stop && "y".equals(choix.toLowerCase()));
		if (stop)
			System.out.println("Dommage … A la prochaine fois");
		else
			System.out.println("A la prochaine!");

		System.out.println("Fin");
		scan.close();

	}
}
