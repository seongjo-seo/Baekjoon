import sys

N = int(sys.stdin.readline())
stack_list = []
stack_sequence = []

stop_button = 0
increase_compare = 1

for i in range(N):
    input_data = (int(sys.stdin.readline()))

    while increase_compare <= input_data:
        stack_list.append(increase_compare)
        stack_sequence.append("+")
        increase_compare += 1

    if stack_list[-1] == input_data:
        stack_list.pop()
        stack_sequence.append("-")

    else:
        print("NO")
        stop_button = 1
        break

if stop_button == 0:
    for items in stack_sequence:
        print(items)
