import sys

N, Len_N = map( int, sys.stdin.readline().split() )

req = list( map (int, sys.stdin.readline().split() ) )
req.sort()

for i in range(N):
    if Len_N >= req[i]:
        Len_N += 1

print(Len_N)