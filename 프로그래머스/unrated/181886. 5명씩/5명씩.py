def solution(names):
    answer = []
    
    for idx, key in enumerate(names):
        if idx % 5 == 0:
            answer.append(key)
    return answer