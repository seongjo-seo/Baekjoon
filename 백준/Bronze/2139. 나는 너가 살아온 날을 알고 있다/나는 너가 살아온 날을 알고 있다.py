from datetime import date

while(True):
    day, month, year = map(int, input().split())

    if year==0 and month==0 and day==0:
        break

    intercalation = date(year, 1, 1)
    res = date(year, month, day)

    cal = (res - intercalation).days+1
    print(cal)
