import sys

N = int(sys.stdin.readline())
first_data = set(map(int, sys.stdin.readline().split()))

M = int(sys.stdin.readline())
second_data = list(map(int, sys.stdin.readline().split()))

for _ in second_data:
    if _ in first_data:
        print("1")
    else:
        print("0")