package outils;

public class Queue<T> {
	private T[] v;
	private int in = 0, out = 0;
	private int cpt = 0;
	private final int max;

	/**
	 * @param max
	 */
	@SuppressWarnings("unchecked")
	public Queue(int max) {
		this.max = max;
		this.v = (T[]) new Object[max];
	}

	public void qin(T elem) {
		if (cpt < max) {
			v[in] = elem;
			in = (in + 1) % max;
			cpt++;
		} else
			throw new ArrayIndexOutOfBoundsException("Queue Overflow");
	}

	/**
	 * retire un élement de la file
	 * 
	 * @return élement ou null si queu vide
	 */
	public T qout() {
		T res = null;
		if (cpt > 0) {
			res = v[out];
			v[out] = null;
			out = (out + 1) % max;
			cpt--;
		}
		return res;
	}

	/**
	 * indique si la file est vide
	 * 
	 * @return
	 */
	public boolean empty() {
		return cpt == 0;
	}

	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>(10);
		q1.qin(10);
		q1.qin(20);
		System.out.println(q1.qout());
		System.out.println(q1.qout());
		System.out.println(q1.qout());
	}
}
