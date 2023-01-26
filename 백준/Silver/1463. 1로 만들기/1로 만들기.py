import sys

X = int( sys.stdin.readline() )
N = [ 0 ] * ( X+1 )


for i in range( 2, X+1 ):
    
    N[i] = N[ i-1 ] + 1

    if i % 3 == 0:
        N[i] = min( N[i//3] + 1, N[i] )
    if i % 2 == 0:
        N[i] = min( N[i//2] + 1, N[i] )

print( N[X] )
