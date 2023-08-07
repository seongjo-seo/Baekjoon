def solution(n_str):
    answer = ''
    
    flag = False
    for char in n_str:
        if char != '0':
            flag = True
        if flag:
            answer += char
            
    return answer