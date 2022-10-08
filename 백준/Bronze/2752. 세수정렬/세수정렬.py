one, two, three = map(int, input().split())

data = [one, two, three]

test1 = min(data)
test2 = max(data)

data.remove(test1)
data.remove(test2)

print(test1, data[0], test2)