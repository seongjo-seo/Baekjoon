num = int(input())

for i in range(num):
    k = int(input()) # 층
    n = int(input()) # 호

    res = [j for j in range(1, n+1)]

    for j in range(k):
        for k in range(1, n):
            res[k] += res[k-1]
    
    print(res[-1])
