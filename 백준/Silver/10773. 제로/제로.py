import sys

N = int( sys.stdin.readline() )

list_data = []

for i in range(N):
    K = int( sys.stdin.readline() )

    if K==0:
        del list_data[-1]
    else:
        list_data.append(K)
        
print(sum(list_data))
