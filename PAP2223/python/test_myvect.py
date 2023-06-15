import unittest
import myvect

class TestMyVect(unittest.TestCase):
    
    def test_estPalindrome(self):
        self.assertTrue(myvect.estPalindrome(['A']))
        self.assertTrue(myvect.estPalindrome(['A','A']))
        self.assertTrue(myvect.estPalindrome(['A','B','A']))
        self.assertTrue(myvect.estPalindrome(['R','A','D','A','R']))
        self.assertFalse(myvect.estPalindrome(['A','B']))
        self.assertFalse(myvect.estPalindrome(['A','B','C','D','B','A']))
    
    def test_fusion(self):
        l0=[]
        l1=[2,3,8,19]
        l2=[4,5,10,25,40]
        l3=[2,3,4,5,8,10,19,25,40]
        self.assertListEqual(l3,myvect.fusion(l1,l2))
            
if __name__ == "__main__":
    unittest.main()