testCase = int(input())

Jeongsu = 100
Sangdeok = 100

for _ in range(testCase):
    JeongsuNumber, SangdeokNumber = map(int, input().split())

    if(JeongsuNumber > SangdeokNumber):
        Sangdeok -= JeongsuNumber
    elif( JeongsuNumber < SangdeokNumber):
        Jeongsu -= SangdeokNumber

print(Jeongsu)
print(Sangdeok)