from sys import stdin

for _ in range(int(stdin.readline())):
    array = list( map(int, stdin.readline().split()))
    array.sort()
    print(array[-3])