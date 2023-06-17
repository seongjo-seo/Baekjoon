def solution(numbers):
    answer = []
    n = len(numbers)
    
    for i in range(n):
        for j in range(i+1, n):
            sum_of = numbers[i] + numbers[j]
            answer.append(sum_of)
            
    answer = sorted(list(set(answer)))
    return answer