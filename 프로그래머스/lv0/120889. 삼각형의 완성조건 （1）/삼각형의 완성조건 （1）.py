def solution(sides):
    answer = 0
    
    for idx in sides:
        max_num = max(sides)
        temp = sorted(sides)
        
        if max_num >= temp[0] + temp[1]:
            answer = 2
        else:
            answer = 1
            
    return answer