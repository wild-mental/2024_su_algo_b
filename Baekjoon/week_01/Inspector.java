package Baekjoon.week_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inspector {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for (int i=1; i<=N; i++) {
            A.add(scan.nextInt());
        }

        int B = scan.nextInt(), C = scan.nextInt();
        long totalInspectorCount = 0;

        for (int i=1; i<=N; i++) {
            int candidateNum = A.get(i - 1);
            candidateNum -= B;
            totalInspectorCount += 1;

            if (candidateNum > 0) {
                    totalInspectorCount += (candidateNum + C - 1) / C;
            }
        }
        System.out.println(totalInspectorCount);
    }
}