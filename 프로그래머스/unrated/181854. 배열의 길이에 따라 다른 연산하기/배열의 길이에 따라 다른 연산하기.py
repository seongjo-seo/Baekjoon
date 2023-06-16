def solution(arr, n):
    answer = []
    
    for idx, key in enumerate(arr):
        if len(arr) % 2 == 0:
            if idx % 2 == 1:
                answer.append(key+n)
            else:
                answer.append(key)
        elif len(arr) % 2 == 1:
            if idx % 2 == 0:
                answer.append(key+n)
            else:
                answer.append(key)
    return answer