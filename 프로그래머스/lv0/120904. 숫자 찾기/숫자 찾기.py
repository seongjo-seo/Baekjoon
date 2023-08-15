def solution(num, k):
    answer = str(num)
    
    for idx, char in enumerate(answer):
        if int(char) == k:
            return idx+1
    
    return -1