package Baekjoon.week_02;
import java.util.ArrayList;
import java.util.Scanner;

public class Boj1100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<Character>> chessBoard = new ArrayList<>();
        for (int i=0; i<8; i++) {
            String line = scan.nextLine();
            ArrayList<Character> chessBoardRow = new ArrayList<>();
            for (int j=0; j<line.length(); j++) {
                chessBoardRow.add(line.charAt(j));
            }
            chessBoard.add(chessBoardRow);
        }
        int horseCount = 0;
        for (int i = 0; i<8; i++) {
            for(int j = 0; j<8; j++) {
                if((i+j)%2 == 0 && chessBoard.get(i).get(j) == 'F') {
                    horseCount++;
                }
            }
        }
        System.out.println(horseCount);
    }
}
