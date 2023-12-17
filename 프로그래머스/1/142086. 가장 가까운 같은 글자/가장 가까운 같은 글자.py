def solution(s):
    answer = [-1]
    for i in range(1, len(s)) :
        st = s[:i]
        if s[i] in st : 
            answer.append(i-st.rindex(s[i]))
        else :
            answer.append(-1)
    return answer