def solution(my_string, alp):
    answer = ''
    
    for char in my_string:
        if char in alp:
            answer += alp.upper()
        else:
            answer += char
            
    return answer