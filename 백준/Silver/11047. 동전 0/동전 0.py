import sys

N, K = map(int, sys.stdin.readline().split())

coin = []
cnt = 0

for i in range(N):
    coin.append(int(sys.stdin.readline()))

coin.sort(reverse=True)

for money in coin:
    cnt += K // money
    K %= money
print(cnt)
