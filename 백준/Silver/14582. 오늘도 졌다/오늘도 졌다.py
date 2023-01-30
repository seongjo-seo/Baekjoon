import sys

wool = list( map (int, sys.stdin.readline().split() ) )
start = list( map (int, sys.stdin.readline().split() ) )

A_wool, B_start = 0, 0

for i in range(9):
    A_wool += wool[i]

    if A_wool > B_start:
        print("Yes")
        break
    elif i == 8 and A_wool <= B_start:
        print("No")
    B_start += start[i]