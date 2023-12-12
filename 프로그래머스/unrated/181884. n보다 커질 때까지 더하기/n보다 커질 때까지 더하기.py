def solution(numbers, n):
    answer = 0
    while (True):
        for i in range(len(numbers)):
            answer += numbers[i]
            if answer > n:
                return answer
                break