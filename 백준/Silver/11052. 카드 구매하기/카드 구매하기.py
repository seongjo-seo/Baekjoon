N = int(input())
card_prices = [*map(int,input().split())]
dp = [card_prices[0]] * N
max_sum = 0

for i in range(1, N):
    dp[i] = max(card_prices[i], *[dp[j] + dp[i-j-1] for j in range(i//2+1)])
    max_sum = max(dp[i], dp[-i])

print(max_sum)