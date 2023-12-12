def solution(num_list):
    first = num_list[-2]
    second = num_list[-1]
    if second > first :
        num_list.append(second - first)
    else :
        num_list.append(second * 2)
    return num_list