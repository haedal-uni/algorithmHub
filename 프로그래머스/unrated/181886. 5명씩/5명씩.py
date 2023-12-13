def solution(names):
    answer = []
    for i in range(len(names)) :
        if (5*i) >= len(names) :
            break
        answer.append(names[5*i])
    return answer