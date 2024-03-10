package Baekjoon.week_04; // 이거 없으니 채점 완료

import java.util.Scanner;

public class boj1357_뒤집힌덧셈 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();

        int result = rev(rev(X) + rev(Y));
        System.out.println(result);
    }

    public static int rev(int number) {
        int reversedNumber = 0;
        while (number>0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
}
