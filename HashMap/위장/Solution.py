def solution(clothes):
    from collections import Counter
    cnt = Counter([type for name, type in clothes])
    combination = 1;
    for num in cnt.values():
        combination *= (num + 1)
    return combination - 1
