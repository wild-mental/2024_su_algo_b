count = 0
board = input().split()

for i in range(64):
    row = i // 8 # 행
    col = i % 8 # 열

    if (row + col) % 2 == 0 and board[row][col] == "F": # 조건 만족시 카운팅
        count += 1
print(count)
