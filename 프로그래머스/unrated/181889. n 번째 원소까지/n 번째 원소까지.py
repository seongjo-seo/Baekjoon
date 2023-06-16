def solution(num_list, n):
    answer = []
    cut = 0
    for i in range(len(num_list)):
        if n == cut:
            break
        cut += 1
        answer.append(num_list[i])
        
    return answer