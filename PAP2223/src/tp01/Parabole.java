package tp01;

import java.awt.geom.Point2D;

public class Parabole {
	// attribut de classe
	public static final double EPS = 0.00000001;
	// attributs d'objet
	private final double a;
	private final double b;
	private final double c;
	private final double delta;

	/**
	 * Equation ax^2+bx+c
	 * 
	 * @param a (a!=0)
	 * @param b
	 * @param c
	 */
	public Parabole(double a, double b, double c) {
		assert a != 0 : "a doit être différent de 0";
		this.a = a;
		this.b = b;
		this.c = c;
		double d = b * b - 4 * a * c;
		// Si delta est proche de 0 ==> il sera à 0
		this.delta = (Math.abs(d) < EPS) ? 0 : d;
	}

	/**
	 * 
	 * @return le nombre de racines de l'equation
	 */
	public byte getNbRacines() {
		if (delta == 0)
			return 1;
		if (delta > 0)
			return 2;
		return 0;
	}

	/**
	 * 
	 * @return la 1ère racine de l'équation
	 */
	public double getRacine1() {
		assert delta >= 0 : " delta>=0 pas de solution";
		return (-b + Math.sqrt(delta)) / (2 * a);
	}

	/**
	 * 
	 * @return la 2ème racine de l'équation
	 */
	public double getRacine2() {
		assert delta >= 0 : " delta>=0 pas de solution";
		return (-b - Math.sqrt(delta)) / (2 * a);
	}

	/**
	 * Calcul f(x)
	 * 
	 * @param x
	 * @return y=f(x)
	 */
	public double f(double x) {
		return a * x*x + b * x + c;
	}

	/**
	 * sommet de la parabole
	 * 
	 * @return x,y
	 */
	public Point2D.Double getSommet() {
		double x1 = -b / (2.0 * a);
		return new Point2D.Double(x1, f(x1));
	}

	public static void main(String[] args) {
		Parabole p1 = new Parabole(2, -3, 1);
		System.out.println("X=2 ==> f(X)= " + p1.f(2));
		System.out.println(p1.getNbRacines());
		double a = 35.0;
		double d = MyMath.calculDist(10.0, a);
		System.out.println("Distance lancé: "+d);
		double angle = Math.toRadians(a);
		Parabole pL = new Parabole(-Math.tan(angle) / d, Math.tan(angle), 0);
		System.out.println("nbRacines: " + pL.getNbRacines());
		System.out.println("f(0): " + pL.f(0));
		System.out.println("f(d): " + pL.f(d));
		System.out.println("f(d/2): " + pL.f(d / 2));
		System.out.println("Sommet pL: "+pL.getSommet());
		

	}

}
