count = 0

for i in range(8) :
    horse = input()
    if i % 2 == 0 :
        for j in range(0, 8, 2) : #짝수행
            if horse[j] == 'F' :
                count += 1
    elif i % 2 != 0 :
        for j in range(1, 8, 2) : #홀수행
            if horse[j] == 'F' :
                count += 1
print(count)