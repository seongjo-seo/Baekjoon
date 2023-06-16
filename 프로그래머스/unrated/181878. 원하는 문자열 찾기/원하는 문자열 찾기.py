def solution(myString, pat):
    answer = 0
    
    for _ in myString:
        if pat.lower() in myString.lower():
            answer = 1
            break
    return answer