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
        int rowIndex = 0;
        for (ArrayList<Character> row : chessBoard) {
            int columnIndex = 0;
            for (char ChessHorse : row) {
                if (rowIndex % 2 != 0 && columnIndex % 2 != 0) {
                    if (ChessHorse == 'F') { horseCount += 1;}
                }
                else if (rowIndex % 2 == 0 && columnIndex % 2 == 0) {
                    if (ChessHorse == 'F') { horseCount += 1;}
                }
                columnIndex += 1;
            }
            rowIndex += 1;
        }
        System.out.println(horseCount);
    }
}
