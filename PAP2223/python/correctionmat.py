def rechercheMin(m):
    mini = m[0][0]
    nbLignes = len(m)
    nbColonnes = len(m[0])
    for i in range(nbLignes):
        for j in range(nbColonnes):
            if m[i][j]<mini : mini= m[i][j]
    return mini

def rechercheMinV2(m):
    mini = m[0][0]
    nbLignes = len(m)
    nbColonnes = len(m[0])
    for i in range(nbLignes):
        mini=min(min(m[i]),mini)
    return mini

def existInMat(m,elem):
    trouve = m[0][0] == elem
    nbLignes = len(m)
    nbColonnes = len(m[0])
    i = 0
    while not trouve and i < nbLignes:
        j = 0
        while not trouve and j < nbColonnes:
            trouve = m[i][j] == elem
            j = j + 1
        i = i + 1
    return trouve    
    
    

if __name__ == '__main__':
    mat = [[2,5,1],[-5,77,8]]
    print(rechercheMin(mat))
    print(rechercheMinV2(mat))
    print(existInMat(mat,77))
    print(existInMat(mat,0))