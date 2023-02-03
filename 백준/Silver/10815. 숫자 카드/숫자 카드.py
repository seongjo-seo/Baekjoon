import sys

N = int( sys.stdin.readline() )
n_card = set( map( int,input().split() ) )

M = int( sys.stdin.readline() )
m_card= list( map( int,input().split() ) )

for i in range(M):
    if m_card[i] in n_card:
        print(1,end=' ')
    else:
        print(0,end=' ')