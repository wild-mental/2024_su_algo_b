N = int(input())

A = list(map(int, input().split()))
B = list(map(int, input().split()))

# A값 오름차순 정리 EX> (1,3,7)
A.sort()

S = 0

for i in range(N):
    B_max = max(B)

    S += A[i] * B_max
    B.remove(B_max)

print(S)


# N = 3
# A = [2, 4, 1]
# B = [5, 3, 7]

# A를 정렬: [1, 2, 4]

# S = 0

# 1번째 반복:
#   i = 0
#   B_max = 7 (B에서 가장 큰 값)
#   S += 1 * 7
#   B = [5, 3]  # B에서 7을 제거

# 2번째 반복:
#   i = 1
#   B_max = 5 (B에서 가장 큰 값)
#   S += 2 * 5
#   B = [3]  # B에서 5를 제거

# 3번째 반복:
#   i = 2
#   B_max = 3 (B에서 가장 큰 값)
#   S += 4 * 3
#   B = []  # B에서 3을 제거
