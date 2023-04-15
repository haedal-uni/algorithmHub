number = int(input())
a =[]
for i in range(number) :
    a.append(tuple(map(int, input().split())))
a.sort(key=lambda x:(x[1], x[0]))
for num in a :
    print(num[0], num[1])