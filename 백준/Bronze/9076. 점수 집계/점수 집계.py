T = int(input())

for i in range(T):
    test_case = list( map(int, input().split()) )

    max_num = max(test_case)
    min_num = min(test_case)
    sum_num = sum(test_case)

    diff = max(test_case[1:-1]) - min(test_case[1:-1])

    if diff >= 4:
        print("KIN")
    else:
        print(sum_num-max_num-min_num)