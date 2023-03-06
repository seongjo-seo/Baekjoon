start_time = input().split(':')
end_time = input().split(':')

start_seconds = int(start_time[0]) * 3600 + int(start_time[1]) * 60 + int(start_time[2])
end_seconds = int(end_time[0]) * 3600 + int(end_time[1]) * 60 + int(end_time[2])

Time_remaining = (end_seconds - start_seconds)

if Time_remaining < 0:
    Time_remaining += 60*60*24

remaining_hours = Time_remaining // 3600
remaining_minutes = (Time_remaining % 3600) // 60
remaining_seconds = Time_remaining % 60

output_string = '{:02d}:{:02d}:{:02d}'.format(remaining_hours, remaining_minutes, remaining_seconds)

print(output_string)