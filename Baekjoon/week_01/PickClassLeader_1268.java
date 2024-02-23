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
        // 1학년 1반인 사람들 다 비교해서 다 카운트
        // 그렇게 9반까지 싹 다 비교
        // 그렇게 5학년까지 비교
    }
}
