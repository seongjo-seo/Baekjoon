def solution(todo_list, finished):
    answer = []
    
    for idx, data in enumerate(todo_list):
        if not finished[idx]:
            answer.append(data)
    return answer