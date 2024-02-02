package Baekjoon.week_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickClassLeader_1268 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> studentInfo = new ArrayList<>();
        int studentNum = scan.nextInt();
        for (int i=0; i<studentNum; i++) {
            ArrayList<Integer>classInfo = new ArrayList<>(new ArrayList<>(List.of
                    (scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt())));
            studentInfo.add(classInfo);
        }
//        for (int[] array : studentInfo) {
//            System.out.println(Arrays.toString(array));
//        }
        ArrayList<Integer> sameCount = new ArrayList<>();
        for (int i=0; i<5; i++) {
            int count = 0;
            for (ArrayList<Integer> info : studentInfo) {
                for (int j=0; j<4; j++) {

                }
            }
        }
    }
}
