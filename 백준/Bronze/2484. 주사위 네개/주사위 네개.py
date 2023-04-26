import sys

n = int(sys.stdin.readline().strip())
max_prize = 0

for i in range(n):
    nums = sorted(list(map(int, sys.stdin.readline().strip().split())))
    prize = 0

    if len(set(nums)) == 1:
        prize = 50000 + nums[0] * 5000
    elif len(set(nums)) == 2:
        if nums[1] == nums[2]:
            prize = 10000 + nums[1] * 1000
        else:
            prize = 2000 + (nums[1] + nums[2]) * 500
    elif len(set(nums)) == 3:
        for j in range(3):
            if nums[j] == nums[j+1]:
                prize = 1000 + nums[j] * 100
                break
    else:
        prize = nums[-1] * 100

    if prize > max_prize:
        max_prize = prize

print(max_prize)