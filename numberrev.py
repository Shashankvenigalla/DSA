def reverse(n):
    reverse=0
    r=n
    while(r!=0):
        r=int(n%10)
        reverse=(reverse*10)+r
        n/=10
    return int(reverse/10)

x=int(input("Enter the number"))
print("reverse of ",x," = " ,reverse(x) )