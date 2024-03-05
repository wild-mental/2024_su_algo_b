## 풀이한 문제 ⚒️
- 1010번

## 소요 시간 🛩️
- [ ] 1시간 미만
- [ ] 1~3시간
- [ o ] 3시간 이상

## 문제풀이 중점사항 🤔
```
const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");
let inputArr = [];
for (let i = 1; i < input.length; i++) {
  inputArr.push(input[i].split(" "));
}

solution(inputArr);

function solution(inputArr) {
  let answer = [];
  inputArr.forEach((el) => {
    const n = el[0];
    const m = el[1];
    const result = Array.from(Array(30), () => Array(30).fill(0));

    for (let i = 1; i <= n; i++) {
      for (let j = i; j <= m; j++) {
        if (j === i) {
          result[i][j] = 1;
        } else if (i === 1) {
          result[i][j] = j;
        } else {
          let temp = 0;
          for (let k = 1; k < j; k++) {
            temp += result[i - 1][k];
          }
          result[i][j] = temp;
        }
      }
    }
    answer.push(result[n][m]);
  });
  console.log(answer.join("\n"));
}

```

## 그 외 추가 리서치 🚀
- gpt 를 좀 활용을 많이 했습니다.. ㅎㅎㅎ

