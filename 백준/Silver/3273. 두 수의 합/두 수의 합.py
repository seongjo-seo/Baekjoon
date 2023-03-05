n = int(input())
sequence = list(map(int, input().split()))
x = int(input())

count = {}
result_count = 0

for items in sequence:
    count[items] = count.get(items, 0) + 1

for num in sequence:
    complement = x - num

    if complement in count:
        result_count += count[complement]

result_count //= 2

print(result_count)