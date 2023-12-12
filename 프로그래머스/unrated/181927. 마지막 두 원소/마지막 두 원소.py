def solution(num_list):
    answer = num_list
    first = num_list[-2]
    second = num_list[-1]
    if second > first :
        answer.append(second - first)
    else :
        answer.append(second * 2)
    return answer