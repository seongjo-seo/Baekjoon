def is_hansu(num):
    if num < 100:
        return True

    digits = [int(d) for d in str(num)]
    diff = digits[1] - digits[0]

    for i in range(1, len(digits) - 1):
        if digits[i + 1] - digits[i] != diff:
            return False
    return True


def count_hansu(N):
    return sum(is_hansu(i) for i in range(1, N + 1))


x = int(input())
print(count_hansu(x))