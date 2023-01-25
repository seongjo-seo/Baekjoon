import sys

req = []
index = []

for i in range(8):
    req.append( int(sys.stdin.readline() ) )

res = sorted(req, reverse=True)

for j in res[:5]:
    index.append(req.index(j)+1)


print(sum(res[:5]))
index.sort()
print(*index)