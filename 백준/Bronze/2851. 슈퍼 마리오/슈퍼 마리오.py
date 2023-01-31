import sys

score, result = 0, 0

for i in range(10):
    N = int(sys.stdin.readline())
    score += N
    if 100 - result >= abs(100 - score):
            result = score
    
print(result)