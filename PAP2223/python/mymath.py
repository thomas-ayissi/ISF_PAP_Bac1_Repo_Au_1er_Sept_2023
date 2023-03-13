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


#print("Nom module: ",__name__)

if __name__ == "__main__":
    print(f'Le nombre 20 est pair {estPair(20)}')
    print(f'Le nombre 27 est pair {estPair(27)}')