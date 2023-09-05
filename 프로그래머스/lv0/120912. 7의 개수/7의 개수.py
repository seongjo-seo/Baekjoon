def solution(array):
    answer = 0
    
    for char in str(array):
        if char == str(7):
            answer += 1
    
    return answer