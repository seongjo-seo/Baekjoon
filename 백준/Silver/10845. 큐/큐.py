import sys

N = int(sys.stdin.readline())

queue = []

for i in range(N):
    input_command = sys.stdin.readline().split()

    if input_command[0] == "push":
        queue.insert(0, input_command[1])
        ##print(queue)

    elif input_command[0] == "pop":
        if len(queue) != 0: print(queue.pop())
        else: print(-1)

    elif input_command[0] == "size":
        print(len(queue))

    elif input_command[0] == "empty":
        if len(queue) == 0: print(1)
        else : print(0)

    elif input_command[0] == "front":
        if len(queue) == 0: print(-1)
        else: print(queue[len(queue) -1])

    elif input_command[0] == "back":
        if len(queue) == 0: print(-1)
        else: print(queue[0])