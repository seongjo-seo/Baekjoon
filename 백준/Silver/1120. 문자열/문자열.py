def difference(a, b):
    min_diff = len(a)
    b_len = len(b)

    for i in range(b_len - len(a) + 1):
        diff = sum([1 for j in range(len(a)) if a[j] != b[i + j]])
        min_diff = min(min_diff, diff)

    return min_diff


A, B = input().split()

result = difference(A, B)
print(result)