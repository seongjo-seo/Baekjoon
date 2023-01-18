import sys
num = int(input())
req = 0
res = 0

for _ in range(num):
    aData, bData, cData = map(int,sys.stdin.readline().split())

    if aData == bData == cData:
        res = max(res, 10000 + (aData*1000))
    elif aData == bData:
        res = max(res, 1000 + aData * 100)
    elif aData == cData:
        res = max(res, 1000 + aData * 100)
    elif bData == cData:
        res = max(res, 1000 + bData * 100)
    else:
        req = max(aData,bData,cData)
        res = max(res, req*100)
print(res)
