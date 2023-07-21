def solution(age):
    answer = 'abcdefghijklmnopqrstuvwxyz'
    
    return ''.join([answer[int(char)] for char in str(age)])