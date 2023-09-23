def solution(strArr):
    answer = {}
    
    for s in strArr:
        length = len(s)
        answer[length] = answer.get(length, 0) + 1
        
    return max(answer.values())