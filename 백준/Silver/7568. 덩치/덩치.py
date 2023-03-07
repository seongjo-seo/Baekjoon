N = int(input())

body_list = []

for _ in range(N):
    weight, height = map(int, input().split())
    body_list.append((weight, height))

for weight_x, height_y in enumerate(body_list):
    rank = 1

    for weight_i, height_j in enumerate(body_list):
        if weight_x == weight_i:
            continue
        if height_j[0] > height_y[0] and height_j[1] > height_y[1]:
            rank += 1

    print(rank, end=' ')