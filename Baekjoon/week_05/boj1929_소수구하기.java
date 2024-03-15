package Baekjoon.week_05;

import java.util.Scanner;

public class boj1929_소수구하기 {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i=2; i*i<=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt(), N = scan.nextInt();

        for (int i=M; i<=N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
