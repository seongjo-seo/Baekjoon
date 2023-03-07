N = int(input())

people = []
rank = []

for _ in range(N):
    x, y = map(int, input().split())
    people.append((x, y))

for person1 in people:
    count = 1
    for person2 in people:
        if person1[0] < person2[0] and person1[1] < person2[1]:
            count += 1
    rank.append(count)

print(*rank)
