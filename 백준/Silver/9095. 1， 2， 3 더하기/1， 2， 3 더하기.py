import sys


def dfs(n):
    if n == 1:
        return 1
    elif n == 2:
        return 2
    elif n == 3:
        return 4
    else:
        return dfs(n - 1) + dfs(n - 2) + dfs(n - 3)


T = int(sys.stdin.readline())

for i in range(T):
    n = int(sys.stdin.readline())
    print(dfs(n))
