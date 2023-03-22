N = int(input())
A_array = list(map(int, input().split()))

P_array = sorted(A_array)
P_idx = {value: [] for value in set(P_array)}

for i, value in enumerate(P_array):
    P_idx[value].append(i)

result = []
for value in A_array:
    idx = P_idx[value].pop(0)
    result.append(idx)

print(*result)