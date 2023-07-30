def solution(arr, k):
    answer = []
    
    for idx, num in enumerate(arr):
        if k % 2 != 0:
            answer.append(num * k)
        if k % 2 == 0:
            answer.append(arr[idx]+k)
            
    return answer