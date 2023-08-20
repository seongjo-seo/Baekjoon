def solution(myString, pat):
    answer = 0
    
    myString = myString.replace("A", "X").replace("B", "A").replace("X", "B")
    
    for i in range(len(myString) - len(pat) + 1):
        if myString[i:i+len(pat)] == pat:
            answer = 1
            break
    
    return answer