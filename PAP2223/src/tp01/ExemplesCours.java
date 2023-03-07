package tp01;

public class ExemplesCours {

	public static void multipleN(int n) {
		assert n > 0 : "Le nombre doit être > 0";
		System.out.println();
		int i;
		for (i = n; i <= n * 5; i = i + n)
			System.out.print(i + " , ");
		System.out.print(i);
		System.out.println();
	}

	public static void main(String[] args) {
		multipleN(2);
		multipleN(3);
		// multipleN(-3);
	}
}
