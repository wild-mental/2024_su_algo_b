package Baekjoon.week_04;

import java.util.*;

public class boj1026_보물 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] A = new int[N];
        Integer[] B = new Integer[N];
        for (int i=0; i<N; i++) {
            A[i] = scan.nextInt();
        }
        for (int i=0; i<N; i++) {
            B[i] = scan.nextInt();
        }

        Arrays.sort(A);
        Integer[] newBArray = Arrays.copyOf(B,B.length);
        Arrays.sort(newBArray, Collections.reverseOrder());

        int answer = 0;
        for (int i=0; i<N; i++) {
            answer += A[i] * newBArray[i];
        }
        System.out.println(answer);
    }
}
