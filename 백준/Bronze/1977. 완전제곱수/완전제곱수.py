import sys

M = int(sys.stdin.readline())
N = int(sys.stdin.readline())

sumNum = 0
minNum = 0

for i in range(1, 101):
    if M <= i*i and N >= i*i:
        if sumNum == 0:
            minNum = i*i
        sumNum += i*i

if sumNum == 0:
    print(-1)
else:
    print(sumNum)
    print(minNum)
