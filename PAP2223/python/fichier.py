def loadMatV1(fichier):
    f = open(fichier,'r',encoding='cp1252')
    nbLignes = int(f.readline())
    f.readline()
    mat = []
    for _ in range(nbLignes):
        mat.append([ int(s)  for s in f.readline().split()])
    f.close()
    return mat

def loadMatV2(fichier):
    f = open(fichier,'r',encoding='cp1252')
    nbLignes = int(f.readline())
    f.readline()
    mat = [ _ for _ in range(nbLignes)]
    for j in range(nbLignes):
        mat[j]=([ int(s)  for s in f.readline().split()])
    f.close()
    return mat
try:
    mat1= loadMatV1('mat1.txt')
    print(mat1)
    mat2= loadMatV2('mat1.txt')
    print(mat2)
except FileNotFoundError as e:
    print('ERREUR: ',e)
    
