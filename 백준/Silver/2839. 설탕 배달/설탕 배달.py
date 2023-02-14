import sys

N = int(sys.stdin.readline())

if N % 5 == 0:
    print(N // 5)
else:
    sugar_bag = 0
    while N > 0:
        N -= 3
        sugar_bag += 1
        if N % 5 == 0:
            sugar_bag += N // 5
            print(sugar_bag)
            break
        elif N == 1 or N == 2:
            print(-1)
            break
        elif N == 0:
            print(sugar_bag)
            break

