import sys

N = int(sys.stdin.readline())
cnt = 0

for _ in range(N):
    word_data = input()
    if list(word_data) == sorted(word_data, key=word_data.find):
        cnt += 1

print(cnt)