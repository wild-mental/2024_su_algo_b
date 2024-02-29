def count_repaints(board):
    repaints = 0
    for i in range(8):
        for j in range(8):
            if (i + j) % 2 == 0 and board[i][j] == 'B':
                repaints += 1
            elif (i + j) % 2 == 1 and board[i][j] == 'W':
                repaints += 1
    return min(repaints, 64 - repaints)

def solution(N, M, board):
    min_repaints = float('inf')

    for i in range(N - 7):
        for j in range(M - 7):
            sub_board = [row[j:j + 8] for row in board[i:i + 8]]
            min_repaints = min(min_repaints, count_repaints(sub_board))

    return min_repaints

# 입력 받기
N, M = map(int, input().split())
board = [input().strip() for _ in range(N)]

# 문제 풀이 함수 호출 및 결과 출력
result = solution(N, M, board)
print(result)
