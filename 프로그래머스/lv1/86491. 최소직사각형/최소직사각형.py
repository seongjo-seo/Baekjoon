def solution(sizes):
    max_width = 0
    max_hight = 0
    
    for size in sizes:
        width = max(size)
        height = min(size)
        
        if width > max_width:
            max_width = width
        if height > max_hight:
            max_hight = height
        
    answer = max_width * max_hight
    return answer