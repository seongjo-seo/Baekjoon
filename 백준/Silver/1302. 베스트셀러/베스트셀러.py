import sys
from collections import Counter

N = int(sys.stdin.readline())

result = []
cnt = {}

for _ in range(N):
    result.append(sys.stdin.readline().split())
result.sort()

for i in result:
    try:
        cnt += i
    except:
        cnt = i

res = Counter(cnt)

data = res.most_common(n=1)

print(data[0][0])
