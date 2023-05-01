n = int(input())

for i in range(1, n+1):
    space = ' ' * (i-1)
    star = '*' * (2*n-2*i+1)
    print(space + star)

for i in range(1, n):
    space = ' ' * (n-i-1)
    star = '*' * (2*i+1)
    print(space + star)