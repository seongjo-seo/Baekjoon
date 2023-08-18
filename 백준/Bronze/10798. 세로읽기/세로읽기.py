def read_vertically(strings):
    # 각 문자열을 15자리로 만들기
    padded_strings = [s.ljust(15, ' ') for s in strings]

    result = ""
    # 세로로 문자들을 읽기
    for i in range(15):
        for s in padded_strings:
            if s[i] != ' ':  # 빈 문자가 아니라면 결과에 추가
                result += s[i]
    return result

values = [input() for _ in range(5)]

print(read_vertically(values))