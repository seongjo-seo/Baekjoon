from itertools import combinations

def find_seven_dwarfs(heights):
    for dwarf_combination in combinations(heights, 7):
        if sum(dwarf_combination) == 100:
            return sorted(dwarf_combination)
    return None

request = [int(input()) for _ in range(9)]

seven_dwarfs = find_seven_dwarfs(request)

print(*seven_dwarfs, sep="\n")