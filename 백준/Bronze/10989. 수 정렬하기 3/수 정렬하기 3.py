import sys
num = int(input())
data = [0] * 10002

for _ in range(num):
    input_num = (int(sys.stdin.readline()))
    data[input_num] = data[input_num]+1

for i in range(10002):
    if data[i] != 0:
        for _ in range(data[i]):
            print(i)