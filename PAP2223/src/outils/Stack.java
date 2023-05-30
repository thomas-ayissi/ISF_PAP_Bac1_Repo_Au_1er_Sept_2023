package outils;

/**
 * 
 * @author Didier Stack d'objet implémenté par un vecteur
 * @param <T> type des éléments
 */
public class Stack<T> {
	private int sommet;
	private T[] v;
	private final int maxSize;

	/**
	 * constructeur
	 * 
	 * @param maxSize Taille maximum du stack
	 */
	@SuppressWarnings("unchecked")
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		v = (T[]) new Object[maxSize];
		sommet = 0;
	}

	/**
	 * Ajoute un élément au sommet du stack
	 * 
	 * @param elem
	 */
	public void push(T elem) {
		if (sommet < maxSize) {
			v[sommet] = elem;
			sommet++;
		} else
			throw new ArrayIndexOutOfBoundsException("Stack overflow");
	}

	/**
	 * retire un élément du stack
	 * 
	 * @return élément
	 */
	public T pop() {
		if (sommet > 0) {
			sommet--;
			T tmp = v[sommet];
			v[sommet] = null; // perte de l'adresse
			return tmp;
		} else
			throw new ArrayIndexOutOfBoundsException("Stack underflow");
	}

	/**
	 * Retourne l'élément au sommet
	 * 
	 * @return
	 */
	public T top() {
		if (sommet > 0) {
			return v[sommet];
		} else
			return null;
	}

	/**
	 * Indique si le stack est vide
	 * 
	 * @return
	 */
	public boolean empty() {
		return sommet == 0;
	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>(20);
		s1.push(1);
		s1.push(2);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		s1=null;
	}

}
