import sys

N = int(sys.stdin.readline())


def Factorization(N):
    req = 2

    while req <= N:
        if N % req == 0:
            print(req)
            N /= req
        else:
            req += 1


Factorization(N)