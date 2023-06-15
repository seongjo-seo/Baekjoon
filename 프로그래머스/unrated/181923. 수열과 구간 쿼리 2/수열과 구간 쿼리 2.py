def solution(arr, queries):
    answer = []
    
    for query in queries:
        s, e, k = query
        sub_arr = arr[s:e+1]
        sub_arr.sort()
        result = -1
        
        for num in sub_arr:
            if num > k:
                result = num
                break
        answer.append(result)
            
    return answer