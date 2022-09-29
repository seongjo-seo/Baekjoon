num = int(input())

for i in range(num):
    req = input().split()
    res =(float(req[0]))
    for j in range(len(req)):
        if req[j]=='@':
            res *= 3
        elif req[j]=='%':
            res += 5
        elif req[j]=='#':
            res -= 7
    print("%0.2f"% res)