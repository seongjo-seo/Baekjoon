import sys

N = int(sys.stdin.readline())
K = 1

count = 0


while N > 0:
    if N < K:
        K = 1
    N -= K
    K += 1
    count += 1

print(count)
