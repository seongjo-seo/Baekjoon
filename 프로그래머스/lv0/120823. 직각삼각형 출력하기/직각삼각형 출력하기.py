n = int(input())
result = ''

for i in range(n):
    for j in range(i+1):
        result += '*'
    result += '\n'

print(result)