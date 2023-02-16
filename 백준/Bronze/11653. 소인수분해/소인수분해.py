import sys

N = int(sys.stdin.readline())
i = 2
r = int(N ** 0.5)

while i<=r:
    while N%i==0:
        print(i)
        N //= i
    i += 1
    
if N > 1:
    print(N)