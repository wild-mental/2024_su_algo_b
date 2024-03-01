n, m = map(int, input().split())
origin = [] #원본 체스판 저장할 리스트
cnt = [] # 다시 칠해야 하는 횟수를 저장할 리스트

for _ in range(n): # 원본 체스판 입력
    origin.append(input())

# 8 X 8 크기가 가능한 지 체스판 검사
for a in range(n-7):
    for b in range(m-7):
        idx1 = 0
        idx2 = 0

        # 8 * 8 부분 체스판 검사
        for i in range(a, a+8):
            for j in range(b, b+8):
                if (i+j) % 2 == 0:
                    if origin[i][j] != 'W':
                        idx1 += 1
                    else:
                        idx2 += 1

                else:
                    if origin[i][j] != 'B':
                        idx1 += 1
                    else:
                        idx2 += 1

        # 최소 횟수를 리스트에 저장
        cnt.append(min(idx1, idx2))
# 최솟값 출력
print(min(cnt))