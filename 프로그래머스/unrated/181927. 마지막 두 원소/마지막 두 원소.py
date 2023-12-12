def solution(num_list):
    answer = num_list
    first = len(num_list) - 2
    second = first + 1
    if num_list[second] > num_list[first] :
        answer.append(num_list[second] - num_list[first])
    else :
        answer.append(answer[second] * 2)
    return answer