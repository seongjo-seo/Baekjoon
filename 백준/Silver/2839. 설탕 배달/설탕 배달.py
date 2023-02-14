import sys

N = int(sys.stdin.readline())
sugar_bag = 0

if N % 5 == 0:
    print(N // 5)
else:
    sugar_bag = N // 5
    N %= 5
    while sugar_bag >= 0:

        if N % 3 == 0:
            print(sugar_bag + N // 3)
            break
        sugar_bag -= 1
        N += 5
        if sugar_bag < 0:
            print(-1)
            break
