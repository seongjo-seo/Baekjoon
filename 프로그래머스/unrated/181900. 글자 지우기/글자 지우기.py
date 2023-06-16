def solution(my_string, indices):
    answer = ''
    
    for idx, key in enumerate(my_string):
        if idx not in indices:
            answer += key
    
    return answer