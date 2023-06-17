def solution(seoul):
    answer = ''
    
    for idx, key in enumerate(seoul):
        if key in 'Kim':
            answer += '김서방은 ' + str(idx) + '에 있다'
    return answer