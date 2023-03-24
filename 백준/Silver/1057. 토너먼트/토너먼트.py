N, jimin, hansoo = map(int, input().split())

rounds = 0

while jimin != hansoo:
    rounds += 1
    jimin = (jimin + 1) // 2
    hansoo = (hansoo + 1) // 2
if rounds == 0:
    print("-1")
else:
    print(rounds)