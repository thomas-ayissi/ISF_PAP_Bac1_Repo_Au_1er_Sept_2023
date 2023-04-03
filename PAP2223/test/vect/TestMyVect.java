package vect;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyVect {
	static int[] v0 = {};
	static int[] v1 = { 5 };
	static int[] v2 = { 1, 2, 6, 9 };

	@Test
	void testSommeV() {
		assertEquals(0, MyVect.sommeV(v0));
		assertEquals(5, MyVect.sommeV(v1));
		assertEquals(18, MyVect.sommeV(v2));
	}

	@Test
	void testExistInV() {
		assertFalse(MyVect.existInV(v0, 9));
		assertFalse(MyVect.existInV(v1, 9));
		assertFalse(MyVect.existInV(v2, 3));
		assertTrue(MyVect.existInV(v1, 5));
		assertTrue(MyVect.existInV(v2, 9));
	}

	@Test
	void testClone() {
		int[] copie = MyVect.cloneV(v2);
		assertTrue(copie != v2);
		assertArrayEquals(v2, copie);
	}

}
