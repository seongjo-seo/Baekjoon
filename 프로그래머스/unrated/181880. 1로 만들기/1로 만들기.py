def solution(num_list):
    answer = 0
    for idx, items in enumerate(num_list):
        while(items > 1):
            if items % 2 == 0:
                items //= 2
                answer +=1
            elif items % 2 == 1:
                items //= 2
                answer +=1
            
            
    return answer