n = int(input())

for i in range(1, n+1):
    s = '*' * (n - i + 1)
    s = s.rjust(n)
    print(s)