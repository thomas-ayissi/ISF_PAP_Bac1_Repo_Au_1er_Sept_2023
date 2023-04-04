package vect;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyVect {
	static int[] v0 = {};
	static int[] v1 = { 5 };
	static int[] v2 = { 1, 2, 6, 9 };
	static int[] v3 = { 1, 2, 6, 4 };
	static int[] v4 = { 1, 0, 6, 9 };
	static int[] v5 = { 1, 1 };

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

	@Test
	void testTrieV1() {
		assertTrue(MyVect.estTrieV1(v1));
		assertTrue(MyVect.estTrieV1(v2));
		assertTrue(MyVect.estTrieV1(v5));
		assertFalse(MyVect.estTrieV1(v3));
		assertFalse(MyVect.estTrieV1(v4));
	}

	@Test
	void testTrieV2() {
		assertTrue(MyVect.estTrieV2(v1));
		assertTrue(MyVect.estTrieV2(v2));
		assertTrue(MyVect.estTrieV2(v5));
		assertFalse(MyVect.estTrieV2(v3));
		assertFalse(MyVect.estTrieV2(v4));
	}

	@Test
	void testInverseV1() {
		int[] v0 = {};
		int[] vi0 = {};
		int[] v1 = { 2 };
		int[] vi1 = { 2 };
		int[] v2 = { 1, 2, 3 };
		int[] vi2 = { 3, 2, 1 };
		int[] v3 = { 1, 2, 3, 4 };
		int[] vi3 = { 4, 3, 2, 1 };
		MyVect.inverseV1(v0);
		assertArrayEquals(vi0, v0);
		MyVect.inverseV1(v1);
		assertArrayEquals(vi1, v1);
		MyVect.inverseV1(v2);
		assertArrayEquals(vi2, v2);
		MyVect.inverseV1(v3);
		assertArrayEquals(vi3, v3);
	}

	@Test
	void testInverseV2() {
		int[] v0 = {};
		int[] vi0 = {};
		int[] v1 = { 2 };
		int[] vi1 = { 2 };
		int[] v2 = { 1, 2, 3 };
		int[] vi2 = { 3, 2, 1 };
		int[] v3 = { 1, 2, 3, 4 };
		int[] vi3 = { 4, 3, 2, 1 };
		MyVect.inverseV2(v0);
		assertArrayEquals(vi0, v0);
		MyVect.inverseV2(v1);
		assertArrayEquals(vi1, v1);
		MyVect.inverseV2(v2);
		assertArrayEquals(vi2, v2);
		MyVect.inverseV2(v3);
		assertArrayEquals(vi3, v3);
	}
}
