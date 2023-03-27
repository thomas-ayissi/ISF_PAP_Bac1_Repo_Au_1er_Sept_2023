package tp01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.geom.Point2D;

import org.junit.jupiter.api.Test;

class TestParabole {
	static Parabole p1 = new Parabole(2, -3, 1);
	static Parabole p2 = new Parabole(2.0, 0.0, 0.0);
	static Parabole p3 = new Parabole(2, 0, 5);



	@Test
	void testGetNbRacines() {
		assertEquals(2, p1.getNbRacines());
		assertEquals(1, p2.getNbRacines());
		assertEquals(0, p3.getNbRacines());
	}

	@Test
	void testGetRacine1() {
		assertEquals(0.0, p2.getRacine1(),Parabole.EPS);
	}

	@Test
	void testGetRacine2() {
		assertEquals(0.0, p2.getRacine2(),Parabole.EPS);
	}

	@Test
	void testF() {
		assertEquals(0.0, p2.f(0.0));
	}

	@Test
	void testGetSommet() {
		assertEquals(new Point2D.Double(0,0), p2.getSommet());
	}

}
