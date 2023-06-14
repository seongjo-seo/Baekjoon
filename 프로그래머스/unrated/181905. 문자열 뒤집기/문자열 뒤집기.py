def solution(my_string, s, e):
    answer = my_string[s:e+1]
    reversd_answer = answer[::-1]
    return my_string[:s] + reversd_answer + my_string[e+1:]