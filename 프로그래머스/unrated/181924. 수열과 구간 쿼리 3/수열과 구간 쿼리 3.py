def solution(arr, queries):
    answer = arr
    for items in queries:
        i, j = items
        answer[i], answer[j] = answer[j], answer[i]
    return answer