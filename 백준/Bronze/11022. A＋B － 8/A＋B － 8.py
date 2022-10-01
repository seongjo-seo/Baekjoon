num = int(input())

for i in range(1, num+1):
    cnt = input().split()
    A = cnt[0]
    B = cnt[1]
    print(f'Case #{i}: {A} + {B} = {int(A)+int(B)}')

