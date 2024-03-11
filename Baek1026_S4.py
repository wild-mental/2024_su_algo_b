N = int(input())
A = list(map(int, input().split())) # 공백을 기준으로 잘라서 리스트로 변환
B = list(map(int, input().split()))
A.sort() # 기본정렬(오름차순)
B.sort(reverse=True) # 역순으로 정렬
S = 0
for i in range(N):
    S += A[i] * B[i] # 서로 곱한 값을 S에 저장

print(S)