sum = 0
res = []
for i in range(0, 5):
    x = int(input())
    sum += x
    res.append(int(x))

res.sort()
print(int(sum/5))
print(res[2])
