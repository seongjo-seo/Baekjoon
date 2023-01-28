import sys

max_num = 0
max_index = 0

for i in range(5):
    a, b, c, d = map(int, sys.stdin.readline().split() )

    cal = a + b + c + d

    if cal > max_num:
        max_num = cal
        max_index = i+1
print( max_index, max_num )
