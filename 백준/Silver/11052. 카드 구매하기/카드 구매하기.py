N = int(input())
card_prices = list(map(int, input().split()))

dp = [0] * (N+1)

dp[0] = 0

for i in range(1, N+1):
    for j in range(0, i):
        dp[i] = max(dp[i], dp[j] + card_prices[i-j-1])

print(dp[N])
