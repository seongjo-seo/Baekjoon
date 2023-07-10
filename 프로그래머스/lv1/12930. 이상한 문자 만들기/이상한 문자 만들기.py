def solution(s):
    answer = ''
    texts = s.split(' ')
    
    for text in texts:
        for idx, char in enumerate(text):
            if idx % 2 == 0:
                answer += char.upper()
            else:
                answer += char.lower()
        answer += ' '
    
    return answer[:-1]