a = 0
for i in range(5):
    num = int(input())
    if(num<=40):
        num=40
    a += num

print(int(a/5))
