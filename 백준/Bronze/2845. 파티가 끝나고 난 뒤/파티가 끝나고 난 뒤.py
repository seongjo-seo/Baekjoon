l, p = map(int, input().split())
diff = []

newspaper = list(map(int, input().split()))

total_people = l * p

for n in newspaper:
    diff.append(str(n - total_people))

print(" ".join(diff))