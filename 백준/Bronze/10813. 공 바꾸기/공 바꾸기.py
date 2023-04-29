n, m = map(int, input().split())

balls = list(range(n+1))

for _ in range(m):
    i, j = map(int, input().split())
    balls[i], balls[j] = balls[j], balls[i]

for i in range(1, n+1):
    print(balls[i], end=' ')