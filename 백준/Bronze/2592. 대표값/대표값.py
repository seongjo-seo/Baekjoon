import sys
from collections import Counter

total = 0
result = [0] * 1001

for i in range(10):
    N = int( sys.stdin.readline() )
    total += N
    result[N] += 1


print(int(total/10))
print(result.index(max(result)))