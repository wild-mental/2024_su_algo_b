def facto(n):
    num = 1
    for i in range(1, n+1):
        num *= i
    return num

a = int(input())

for _ in range(a):
    n, m = map(int, input().split())
    connection = facto(m) // (facto(n) * facto(m - n))
    print(connection)