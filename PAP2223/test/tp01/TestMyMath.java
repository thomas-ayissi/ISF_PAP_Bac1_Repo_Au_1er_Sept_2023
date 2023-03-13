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
		assertEquals(0,MyMath.fibo(0));
		assertEquals(1,MyMath.fibo(1));
		assertEquals(1,MyMath.fibo(2));
		assertEquals(8,MyMath.fibo(6));
		assertThrows(AssertionError.class, () -> MyMath.fibo(-1));
	}
	
}
