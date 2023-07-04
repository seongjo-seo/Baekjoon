def solution(numbers):
    answer = float('-inf')
    
    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            temp = numbers[i] * numbers[j]
            answer = max(answer, temp)
    
    return answer