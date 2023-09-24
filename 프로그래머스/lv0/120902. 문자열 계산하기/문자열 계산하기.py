def solution(my_string):
    s = my_string.split()
    answer = int(s[0])
    
    for i in range(1, len(s), 2):
        operator = s[i]
        num = int(s[i+1])
        
        if operator == "+":
            answer += num
        elif operator == "-":
            answer -= num
        
    return answer