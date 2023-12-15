
n=6
for _ in range(n):
    for i in range(n-_):
        print(" ",end="")
    for i in range(_):
        print("*",end="")
    print()