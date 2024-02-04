n = int(input()) # 학생수 입력
Ban = [] #학년별 반 입력
match = [0] * n
for i in range(n):
    Ban.append(list(map(int, input().split())))
    match[i] = [0] * n

for i in range(5):
    for j in range(n):
        for k in range(j + 1, n):
            if Ban[j][i] == Ban[k][i]:
                match[k][j] = 1 # 동일한 값이면 값을 1로 변경
                match[j][k] = 1


cnt = []
for s in match:
    cnt.append(s.count(1))

print(cnt.index(max(cnt)) + 1) # 가장 큰 값의 인덱스 출력