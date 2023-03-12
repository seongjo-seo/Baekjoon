min_sum  = 0

N = int(input())
data_list = list(map(int, input().split()))

data_list.sort()

for i in range(N):
    min_sum += data_list[i] * (N - i)

print(min_sum)
