import sys

N = int(sys.stdin.readline())

A_list = list(map(int, sys.stdin.readline().split()))
B_list = list(map(int, sys.stdin.readline().split()))

S = 0

A_list.sort()

for i in range(N):
    S += (max(B_list) * A_list[i])
    B_list.remove(max(B_list))

print(S)