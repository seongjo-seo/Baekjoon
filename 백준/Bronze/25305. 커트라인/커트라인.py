N, K = map( int, input().split() )
res = list( map ( int, input().split() ) )

res.sort(reverse=True)
print(res[K-1])
