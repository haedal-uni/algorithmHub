def solution(s):
    answer = s.split(" ")
    answer.sort(key=int)
    return answer[0] + " " + answer[-1]