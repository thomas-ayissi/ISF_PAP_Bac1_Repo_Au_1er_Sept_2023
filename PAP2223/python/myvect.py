def estPalindrome(v):
    i = 0
    j = len(v)-1
    while i<j and v[i]==v[j]:
        i = i + 1
        j = j - 1
    return i>=j

def fusion(l1,l2):
    '''Fusion de 2 listes triées'''
    n1 = len(l1)
    n2 = len(l2)
    i,j,k = 0,0,0
    l3 = [0 for _ in range(n1+n2)]
    while i<n1 and j<n2 :
        while i<n1 and l1[i]<=l2[j]:
            l3[k] = l1[i]
            k = k + 1
            i = i + 1
        if i<n1 :
            while j<n2 and l1[i]>=l2[j] :
                l3[k] = l2[j]
                k = k + 1
                j = j + 1
    # vide la liste restante
    while i<n1:
        l3[k] = l1[i]
        k = k + 1
        i = i + 1
        
    while j<n2:
        l3[k] = l2[j]
        k = k + 1
        j = j + 1
    return l3 
        
    
