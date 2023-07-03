def solution(cipher, code):
    answer = ''
    
    for idx, key in enumerate(cipher):
        if (idx+1) % code == 0:
            answer += key
    return answer