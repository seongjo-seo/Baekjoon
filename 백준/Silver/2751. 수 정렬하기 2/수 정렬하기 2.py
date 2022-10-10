import sys
num = int(input())

data = []
for i in range(num):
    data.append(int(sys.stdin.readline()))

data.sort()

for j in data:
    print(j)
