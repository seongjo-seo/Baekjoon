def solution(my_string):
    answer = ''
    temp = set()
    
    for char in my_string:
        if char not in temp:
            temp.add(char)
            answer += char
    
    return answer