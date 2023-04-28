n, k = map(int, input().split())
passengers = k

for i in range(n):
    a, b = map(int, input().split())
    passengers += (a - b)

print("비와이")