package tp01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestMyMath {
	@Test
	void testEstPair() {
		assertTrue(MyMath.estPair(8));
		assertFalse(MyMath.estPair(3));
		assertTrue(MyMath.estPair(0));
		assertThrows(AssertionError.class, () -> MyMath.estPair(-2));
	}

	@Test
	void testFibo() {
		assertEquals(0, MyMath.fibo(0));
		assertEquals(1, MyMath.fibo(1));
		assertEquals(1, MyMath.fibo(2));
		assertEquals(8, MyMath.fibo(6));
		assertThrows(AssertionError.class, () -> MyMath.fibo(-1));
	}

	@Test
	void testnbBitsV1() {
		assertEquals(0, MyMath.nbBitsV1Bis(0));
		assertEquals(32, MyMath.nbBitsV1Bis(-1));
		assertEquals(2, MyMath.nbBitsV1Bis(10));
	}

	@Test
	void testnbBitsV2() {
		assertEquals(0, MyMath.nbBitsV2Bis(0));
		assertEquals(32, MyMath.nbBitsV2Bis(-1));
		assertEquals(1, MyMath.nbBitsV2Bis(1));
		assertEquals(2, MyMath.nbBitsV2Bis(10));
	}
	
	@Test
	void testDistance() {
		assertEquals(8.836993916, MyMath.calculDist(10.0, 30.0), 0.0000001);
		assertThrows(AssertionError.class, () -> MyMath.calculDist(-10.0, 100.0));
		assertThrows(AssertionError.class, () -> MyMath.calculDist(10.0, 100.0));
		assertThrows(AssertionError.class, () -> MyMath.calculDist(10.0, 0.0));
	}
	
	@Test
	void testUtf8() {
		assertEquals(1, MyMath.getNbBytesUtf8('A'));
		assertEquals(2, MyMath.getNbBytesUtf8('é'));
		assertEquals(3, MyMath.getNbBytesUtf8('€'));
	}
	
}
