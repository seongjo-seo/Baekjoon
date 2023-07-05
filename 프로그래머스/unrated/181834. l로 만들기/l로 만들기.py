def solution(myString):
    answer = ''
    for char in myString:
        if char > 'l':
            answer += char
        else:
            answer += 'l'
    return answer