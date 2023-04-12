a, b, c, d, e, f = map(int, input().split())

denominator = a * e - b * d

if denominator == 0:
    print("해가 존재하지 않습니다.")
else:
    x_numerator = e * c - b * f
    y_numerator = -d * c + a * f

    x = x_numerator // denominator
    y = y_numerator // denominator
    print(x, y)