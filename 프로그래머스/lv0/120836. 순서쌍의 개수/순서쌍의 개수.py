import math
# 다시 풀어봐야 할 문제.
def solution(n):
    answer = 0
    sqrt_n = int(math.sqrt(n))
    
    for i in range(1, sqrt_n+1):
        if n % i == 0:
            answer += 1
            if n // i != i:
                answer += 1
    return answer