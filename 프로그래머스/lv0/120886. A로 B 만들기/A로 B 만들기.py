def solution(before, after):
    answer = 0
    if sorted(before) == sorted(after):
        return 1
    else:
        return 0
    
    return answer