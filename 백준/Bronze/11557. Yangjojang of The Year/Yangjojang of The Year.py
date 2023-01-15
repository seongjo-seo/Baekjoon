testCase = int(input())

for _ in range(testCase):
    req = int(input())
    resName = ""
    maxNumber = 0
    
    for _ in range(req):
        name, number = input().split()
        number = int(number)

        if( number > maxNumber ):
            maxNumber = number
            resName = name
            
    print(resName)
