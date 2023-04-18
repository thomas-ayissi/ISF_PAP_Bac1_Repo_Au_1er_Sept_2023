import unittest
import myvect

class TestMyMath(unittest.TestCase):
    
    def test_estPalindrome(self):
        self.assertTrue(myvect.estPalindrome(['A']))
        self.assertTrue(myvect.estPalindrome(['A','A']))
        self.assertTrue(myvect.estPalindrome(['A','B','A']))
        self.assertTrue(myvect.estPalindrome(['R','A','D','A','R']))
        self.assertFalse(myvect.estPalindrome(['A','B']))
        self.assertFalse(myvect.estPalindrome(['A','B','C','D','B','A']))
            
if __name__ == "__main__":
    unittest.main()