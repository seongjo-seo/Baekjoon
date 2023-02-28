import sys

end_of_world = [666]
index = 1666
N = int(sys.stdin.readline())


while len(end_of_world) < N:
    if '666' in str(index):
        end_of_world.append(index)
    index += 1

print(end_of_world[N-1])
