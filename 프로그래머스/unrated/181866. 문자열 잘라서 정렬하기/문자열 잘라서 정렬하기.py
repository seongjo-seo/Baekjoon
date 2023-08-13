def solution(myString):
    answer = myString.split('x')
    request = [item for item in answer if item]
    result = sorted(request)
                    
    return result