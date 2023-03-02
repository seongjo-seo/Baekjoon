import sys

Xcm = int(sys.stdin.readline())
cnt = 0
request = 64

while Xcm > 0:
    if request > Xcm:
        request /= 2
    else:
        Xcm -= request
        cnt += 1

print(cnt)