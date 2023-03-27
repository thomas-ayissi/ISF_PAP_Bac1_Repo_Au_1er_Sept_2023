package tp01;

import java.awt.geom.Point2D;


public class Parabole {
	private final double a;
	private final double b;
	private final double c;
	private final double delta;

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Parabole(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.delta = b * b - 4 * a * c;
	}
	
	public byte getNbSol() {
		if (Math.abs(delta) < 0.0000001)
			return 1;
		if (delta > 0)
			return 2;
		return 0;
	}
	
	public double f(double x) {
		return a * x * x + b * x + c;
	}

	public static void main(String[] args) {
	  Parabole p1= new Parabole(2, -3, 1)	;
	  System.out.println("X=0 ==> f(X)= "+p1.f(0));
		
	}

}
