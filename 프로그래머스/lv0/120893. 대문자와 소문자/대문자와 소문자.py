def solution(my_string):
    answer = ''
    
    for char in my_string:
        if char.isupper():
            answer += char.lower()
        elif char.islower():
            answer += char.upper()
            
    return answer