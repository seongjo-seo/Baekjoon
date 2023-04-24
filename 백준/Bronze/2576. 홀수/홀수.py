sum = 0
min_num = 100

for _ in range(0, 7):
    num = int(input())
    
    if num % 2 == 1:
        sum += num
        min_num = min(num, min_num)

if sum == 0:
    print(-1)
else:
    print(sum)
    print(min_num)