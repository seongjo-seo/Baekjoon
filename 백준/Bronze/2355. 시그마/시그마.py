import sys

A, B = map(int, sys.stdin.readline().split())

maxNum = max(A, B)
minNum = min(A, B)

num = ( A + B ) * ( maxNum - minNum + 1 ) / 2


print(int(num))
