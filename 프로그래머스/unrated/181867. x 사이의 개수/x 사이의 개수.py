def solution(myString):
    answer = myString.split('x')
    result = [len(s) for s in answer]
    
    return result