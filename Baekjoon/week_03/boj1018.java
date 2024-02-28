package Baekjoon.week_03;
import java.util.Scanner;

public class boj1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int changes = calculateChanges(board, i, j);
                minChanges = Math.min(minChanges, changes);
            }
        }

        System.out.println(minChanges);
    }

    private static int calculateChanges(char[][] board, int x, int y) {
        int changes1 = 0;
        int changes2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[x + i][y + j] != 'W') changes1++;
                    if (board[x + i][y + j] != 'B') changes2++;
                } else {
                    if (board[x + i][y + j] != 'B') changes1++;
                    if (board[x + i][y + j] != 'W') changes2++;
                }
            }
        }
        return Math.min(changes1, changes2);
    }
}
