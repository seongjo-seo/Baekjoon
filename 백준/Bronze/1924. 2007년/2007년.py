x, y = map(int, input().split())

month_days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
total_days = sum(month_days[:x-1]) + y

day_of_week = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
print(day_of_week[(total_days-1) % 7])