def solution(s):
    answer = {}
    
    for char in s:
        answer[char] = answer.get(char, 0) + 1
    
    answer = sorted([char for char, count in answer.items() if count == 1])
    
    return ''.join(answer)