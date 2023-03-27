import math

def estPair(n : int)-> bool:
    '''indique si un nombre est pair'''
    assert type(n) == int and n>=0, "Le nombre doit être un entier >=0"
    return n%2==0

def fibo(n : int) -> int :
    '''Calcule le nème nbr de Fibonacci '''
    assert type(n)==int and n>=0 , " Doit être un entier >=0"
    f0 , f1 , f2 = 0 , 1 , n
    for i in range(1,n):
        f2 = f1 + f0
        f1 , f0 = f2 , f1
    return f2

def calculPhi(prec : float)-> (int,float):
    '''Calcul le nombre d'itérations pour avoir le nombre d'or
        avec une précision donnée '''
    assert 0< prec <=1 , "Doit respecter: 0< prec <=1"
    phi= (1 + math.sqrt(5))/2
    f0 = f1 = 1
    n = 2
    while math.fabs(phi - f1 / f0)> prec:
        f2 = f1 + f0
        f0 , f1 = f1 , f2
        n = n + 1
    return n , f1/f0


def nbBitsV1(n:int)->int:
    '''Calcule le nombre de bits à 1 au minimum pour coder le nombre n'''
    taille=n.bit_length()
    # comptabilise le bit de signe si négatif
    cpt = 0 if n>=0 else 1
    m = 1
    for i in range(0,taille):
        if (n & m)!=0 :
            cpt = cpt + 1
        m = m << 1
    return  cpt
            
    
    

    
def nbBitsV2Bis(n:int)->int:
    '''Calcule le nbr de bits à 1 sur une zone de 32bits'''
    assert  -(1<<31)<= n < (1<<31) , "le nombre doit tenir sur 32bits"
    #Si négatif conversion en un motif sur 32 bits entier
    if n<0 :
        n = (1<< 32) + n
    cpt = 0
    while n != 0 :
        cpt = cpt + (n & 1)
        n= n>>1
    return cpt

    
    
    
    

#print("Nom module: ",__name__)

if __name__ == "__main__":
    print(nbBitsV2Bis(-1))
    print(f'Calcul n: {calculPhi(0.1)}')
    print(f'Le nombre 20 est pair {estPair(20)}')
    print(f'Le nombre 27 est pair {estPair(27)}')