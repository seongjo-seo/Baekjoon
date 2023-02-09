import sys

T = int(sys.stdin.readline())
res = 0

for i in range(T):
    x_1, y_1, r_1, x_2, y_2, r_2 = map(int, sys.stdin.readline().split())

    res = abs((x_1 - x_2) ** 2 + (y_1 - y_2) ** 2) ** (1 / 2)
    if res == 0 and r_1 == r_2:
        print(-1)
    elif abs(r_1 + r_2) == res or abs(r_2 - r_1) == res:
        print(1)
    elif abs(r_1 - r_2) < res < (r_1 + r_2):
        print(2)
    else:
        print(0)
