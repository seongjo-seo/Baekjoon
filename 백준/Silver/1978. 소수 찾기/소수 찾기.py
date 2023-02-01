N = int(input())

prime_number = map(int, input().split())

result = 0

for i in prime_number:
    count = 0
    if i > 1:
        for j in range(2, i):
            if i % j == 0:
                count += 1
        if(count==0):
            result += 1

print(result)