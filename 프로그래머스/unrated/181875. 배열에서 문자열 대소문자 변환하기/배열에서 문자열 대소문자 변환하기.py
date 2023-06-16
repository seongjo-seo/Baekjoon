def solution(strArr):
    answer = [string.lower() if i % 2 == 0 else string.upper() for i, string in enumerate(strArr)]
    
    return answer