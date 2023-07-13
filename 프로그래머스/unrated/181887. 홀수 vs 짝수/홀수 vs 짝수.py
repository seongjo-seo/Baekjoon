def solution(num_list):
    answer = 0
    
    temp_A = 0
    temp_B = 0
    
    for idx, num in enumerate(num_list):
        
        if (idx + 1) % 2 == 0:
            temp_A += num
        else:
            temp_B += num
        
        if temp_A > temp_B:
            answer = temp_A
        else:
            answer = temp_B
    return answer