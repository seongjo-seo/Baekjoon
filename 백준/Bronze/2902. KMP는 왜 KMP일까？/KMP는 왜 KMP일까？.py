name = input().split("-")
result = []

for i in range(len(name)):
    result.append(name[i][0])

print(*result, sep="")