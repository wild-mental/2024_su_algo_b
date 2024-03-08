# Rev(Rev(X) + Rev(Y))
x, y = map(str, input().split())
x_rev = x[::-1]
y_rev = y[::-1] # 문자열 역순

X = int(x_rev)
Y = int(y_rev) # 정수형 변환

answer = str(X+Y)
answer_rev = int(answer[::-1])
print(answer_rev)