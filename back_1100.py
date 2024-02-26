# 체스판 상태 input으로 입력
board = []
for i in range(8):
    row = input().strip()
    board.append(row)

# 하얀 칸 위에 말이 몇 개???
white_horse = 0
for i in range(8):
    for j in range(8):
        # 하얀 칸인 경우(흰색 칸은 '행'과 '열'의 합이 짝수!)
        if (i + j) % 2 == 0:
            #하얀 칸이고 그 자리가 F인지 확인
            if board[i][j] == 'F':
                white_horse += 1

print(white_horse)
