import sys

T = int(sys.stdin.readline())

for i in range(T):
    N, M = map(int, sys.stdin.readline().split())

    count = 0

    for j in range(N, M + 1):
        count += str(j).count('0')

    print(count)
