N = int(input())
locations = []
cnt = 0

for _ in range(N):
    cow, loc = map(int, input().split())
    
    if cow > len(locations):
        locations.extend([[] for _ in range(cow - len(locations))])
        
    locations[cow-1].append(loc)

for locs in locations:
    prev_loc = None
    
    for loc in locs:
        if prev_loc != None and prev_loc != loc:
            cnt += 1
        prev_loc = loc

print(cnt)
