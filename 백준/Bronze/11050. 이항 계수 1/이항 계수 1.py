N, K = map(int, input().split())

num = 1
for i in range(K):
    num *= N-i


def factorial(K):
    if K < 2:
        return 1
    else:
        return K * factorial(K-1)

req = factorial(K)


res = num // req
print(res)
