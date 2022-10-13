import sys
num = int(input())

for i in range(num):
    a, b = map(int, sys.stdin.readline().split())
    res = a%10

    if res == 0:
        print(10)
    elif res in [1, 5, 6]:
        print(res)
    elif res in [4, 9]:
        if b % 2 == 0:
            print(res ** 2 % 10)
        else:
            print(res)
    else:
        if b % 4 == 0:
            print(res ** 4 % 10)
        else:
            print(res ** (b % 4) % 10)
