def solution(hp):
    general_power = 5
    soldier_power = 3
    worker_power = 1

    min_army = [0] * (hp + 1)

    for i in range(1, hp + 1):
        min_army[i] = float('inf')

        if i >= general_power:
            min_army[i] = min(min_army[i], min_army[i - general_power] + 1)

        if i >= soldier_power:
            min_army[i] = min(min_army[i], min_army[i - soldier_power] + 1)

        if i >= worker_power:
            min_army[i] = min(min_army[i], min_army[i - worker_power] + 1)

    return min_army[hp]