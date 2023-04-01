list_data = []
max_num = 0
max_index = 0

for i in range(9):
    list_data.append(int(input()))
    if list_data[i] >= max_num:
        max_num = max(max_num, list_data[i])
        max_index = i

print(max_num)
print(max_index+1)