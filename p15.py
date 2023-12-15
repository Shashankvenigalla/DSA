n=6
for j in range(1,n+1):
        print(j*"*",end="")
        print((n-j)*"/",end="")
        print(j*"*")
for j in range(n-1,1,-1):
    print(j*"*",end="")
    print((n-j)*" ",end="")
    print(j*"*")