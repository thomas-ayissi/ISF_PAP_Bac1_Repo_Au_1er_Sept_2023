import unittest
import mymath

class TestMyMath(unittest.TestCase):
    
    def test_estPair(self):
        self.assertEqual(True,mymath.estPair(20))
        self.assertEqual(False,mymath.estPair(21))
        self.assertEqual(True,mymath.estPair(0))
        self.assertRaises(AssertionError,mymath.estPair,-1)
        self.assertRaises(AssertionError,mymath.estPair,5.0)
        self.assertRaises(AssertionError,mymath.estPair,"brol")
    
    def test_fibo(self):
        self.assertEqual(0,mymath.fibo(0))
        self.assertEqual(1,mymath.fibo(1))
        self.assertEqual(1,mymath.fibo(2))
        self.assertEqual(8,mymath.fibo(6))
        self.assertRaises(AssertionError,mymath.fibo,-1)

if __name__ == "__main__":
    unittest.main()