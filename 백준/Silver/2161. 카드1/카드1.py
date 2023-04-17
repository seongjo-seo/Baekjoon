n = int(input())
cards = list(range(1, n+1))
discarded = []

while len(cards) > 1:
    discarded.append(cards.pop(0))
    cards.append(cards.pop(0))

print(*discarded, cards[0])