def solution(n):
    answer = 1
    while True:
        if (n * answer) % 6 == 0:
            return (n * answer) // 6
        answer += 1
    return answer