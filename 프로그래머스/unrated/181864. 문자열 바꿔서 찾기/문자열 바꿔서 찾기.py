def solution(myString, pat):
    answer = 0
    myString = myString.replace("A","b").replace("B","a")
    if pat.lower() in myString:
        answer = 1
    return answer