def estPalindrome(v):
    i = 0
    j = len(v)-1
    while i<j and v[i]==v[j]:
        i = i + 1
        j = j - 1
    return i>=j

