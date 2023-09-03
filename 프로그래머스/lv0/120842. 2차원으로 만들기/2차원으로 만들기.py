def solution(num_list, n):
    columns = [[]] * (len(num_list) // n )
    
    answer = [num_list[i:i+n] for i in range(0, len(num_list), n)]
    
    return answer