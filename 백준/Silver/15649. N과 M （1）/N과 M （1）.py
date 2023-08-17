from typing import List

def permutations(sequence: List[int], N: int, M: int) -> None:
    # 종료 조건: 수열의 길이가 M과 같으면 출력
    if len(sequence) == M:
        print(" ".join(map(str, sequence)))
        return

    for i in range(1, N + 1):
        if i not in sequence:  # 원소가 이미 선택된 경우는 제외
            # 원소 선택하기
            sequence.append(i)

            # 다음 원소 선택을 위한 재귀 호출
            permutations(sequence, N, M)

            # 원소를 선택하지 않고 넘어가기
            sequence.pop()

N, M = map(int,input().split())

permutations([], N, M)

