A, B = map(int, input().split())
sequence_list = []

sum = 0
num = 1

for i in range(1, B+1):
    for j in range(i):
        sequence_list.append(num)
        if len(sequence_list) == B:
            break
    num += 1
    if len(sequence_list) == B:
        break

for i in range(A-1, B):
    if i >= len(sequence_list):
        break
    sum += sequence_list[i]

print(sum)