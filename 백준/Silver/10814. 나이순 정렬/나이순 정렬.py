from sys import stdin

def main():
    input_line = stdin.readline

    N = int(input_line())
    members = []

    for idx in range(N):
        age, name = input_line().split()
        members.append((int(age), name, idx))

    members.sort(key=lambda x: (x[0], x[2]))

    for member in members:
        print(member[0], member[1])

if __name__ == "__main__":
    main()