import sys

N = int(sys.stdin.readline())
sum = 0

for _ in range(N):
    sum += int(sys.stdin.readline())

print(sum - (N - 1))