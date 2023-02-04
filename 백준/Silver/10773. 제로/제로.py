import sys

N = int( sys.stdin.readline() )

list_data = []
result = 0

for i in range(N):
    K = int( sys.stdin.readline() )

    if K==0:
        del list_data[-1]
    else:
        list_data.append(K)

for j in range(len(list_data)):
    result += int(list_data[j])
        
print(result)
