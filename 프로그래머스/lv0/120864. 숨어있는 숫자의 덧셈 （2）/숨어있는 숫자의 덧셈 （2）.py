import re

def solution(my_string):
    nums = re.findall(r'\d+', my_string)
    answer = sum(int(num) for num in nums)    
            
    return answer