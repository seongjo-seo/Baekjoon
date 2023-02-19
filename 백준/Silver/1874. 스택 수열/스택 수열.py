import sys

N = int(sys.stdin.readline())
input_data = []

for i in range(N):
    input_data.append(int(sys.stdin.readline()))


def sequence(N: int, input_data: list):
    """

    :param N: N번 반복할 데이터
    :param input_data: 수열을 이루는 1이상 n이하의 정수
    :return: -> answer
    """
    stack_list = []
    stack_operator = []
    compare_index = 0

    for items in range(1, N+1):
        stack_list.append(items)
        stack_operator.append("+")

        while stack_list and stack_list[-1] == input_data[compare_index]:
            stack_list.pop()
            stack_operator.append("-")
            compare_index += 1

        if stack_list and items == N:
            return "NO"

    return "\n".join(stack_operator)


print(sequence(N, input_data))