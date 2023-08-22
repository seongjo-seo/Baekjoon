def solution(arr, divisor):
    answer = []
    
    for idx, num in enumerate(arr):
        if num % divisor == 0:
            answer.append(num)
            
    if len(answer) == 0:
        answer.append(-1)
    else:
        answer.sort()
    return answer