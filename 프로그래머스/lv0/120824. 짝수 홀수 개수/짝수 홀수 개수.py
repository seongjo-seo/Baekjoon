def solution(num_list):
    even = sum(1 for num in num_list if num % 2 == 0)
    odd = sum(1 for num in num_list if num % 2 == 1)
    
    answer = [even, odd]
    
    return answer