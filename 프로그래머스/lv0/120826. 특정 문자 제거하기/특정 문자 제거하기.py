def solution(my_string, letter):
    answer = ''
    
    for char in my_string:
        if letter != char:
            answer += char
    return answer