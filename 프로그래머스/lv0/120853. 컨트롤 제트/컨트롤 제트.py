def solution(s):
    elements = s.split()
    stack = []
    
    for element in elements:
        if element == "Z":
            if stack:
                stack.pop()
        else:
            stack.append(int(element))
    
    return sum(stack)