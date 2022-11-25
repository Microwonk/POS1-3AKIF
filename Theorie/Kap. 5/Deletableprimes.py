import math

def prime(n):
    if n == 1:return False
    for i in range(2, int(math.sqrt(n)+1)):
        if n % i == 0:return False
    return True

def very_prime(n,liste):
    if prime(n):
        if n<10:return liste+[n]
        else:return very_prime(n//10,liste+[n])
    else:return liste

print(very_prime(4567,[]))