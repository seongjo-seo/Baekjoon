def solution(n, slicer, num_list):
    answer = []
    
    if n == 1:
        answer.extend(num_list[:slicer[1]+1])
    elif n == 2:
        answer.extend(num_list[slicer[0]:]) # 맞는 코드
    elif n == 3:
        answer.extend(num_list[slicer[0]:slicer[1]+1])
    elif n == 4:
        answer.extend(num_list[slicer[0]:slicer[1]+1:slicer[2]])
        
    return answer