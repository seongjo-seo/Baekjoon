a = int(input())
b = int(input())
c = int(input())

result = a * b * c

count_list = [0] * 10

for num in str(result):
    count_list[int(num)] += 1

print(*count_list, sep='\n')
