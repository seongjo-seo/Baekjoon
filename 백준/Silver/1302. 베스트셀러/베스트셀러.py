import sys

N = int(sys.stdin.readline())

result = []

for _ in range(N):
    result.append(sys.stdin.readline().split())
result.sort()

print(*max(result, key=result.count))