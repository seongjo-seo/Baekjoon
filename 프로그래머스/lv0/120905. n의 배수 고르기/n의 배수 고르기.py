def solution(n, numlist):
    answer = []
    
    for idx, key in enumerate(numlist):
        if key % n == 0:
            answer.append(key)
            
    return answer