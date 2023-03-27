t = int(input())

for _ in range(t):
    r, e, c = map(int, input().split())

    test_case = e - r - c

    if test_case > 0:
        print("advertise")
    elif test_case == 0:
        print("does not matter")
    else:
        print("do not advertise")