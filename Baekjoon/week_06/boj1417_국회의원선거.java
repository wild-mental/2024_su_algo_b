package Baekjoon.week_06;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class boj1417_국회의원선거 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] M = new int[N];
        int[] newM = new int[N-1];

        for(int i=0; i<N; i++){
            M[i] = scan.nextInt();
            if(i != 0) {
                newM[i-1] = M[i];
            }
        }
        Arrays.sort(newM);

        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += M[i];
        }
        int voteCnt = 0;
        if (N == 1) {
            voteCnt = 0;
        }
        else if (M[N-1] == M[0]) {
            voteCnt += 1;
        }
        else if (sum % N != 0) {
            for (int i=N-2; i>=0; i--) {
                if((sum / N) < newM[i]) {
                    if (newM[i] == M[0]) {
                        voteCnt += 1; break;
                    } else if (newM[i] < M[0]) {
                        break;
                    }
                    else if (M[0] < newM[i]) {
                        M[0] += newM[i] - (sum / N);
                        voteCnt += newM[i] - (sum / N);
                    }
                }
            }
        }
        System.out.println(voteCnt);
    }
}
