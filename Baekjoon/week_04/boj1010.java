package Baekjoon.week_04;
import java.util.Scanner;

public class boj1010 {
    private static long combination(int n, int k) {
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n--;
            result /= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int Case = 0; Case < T; Case++) {
            // 서쪽 사이트의 개수 N과 동쪽 사이트의 개수 M을 입력받음
            int N = scan.nextInt();
            int M = scan.nextInt();

            System.out.println(combination(M, N));
        }
    }
}
