import java.util.ArrayList;
import java.util.Scanner;

public class Inspector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0; i<N; i++) {
            A.add(scan.nextInt());
        }

        int B = scan.nextInt(), C = scan.nextInt();
        int totalInspectorCount = 0;

        for (int i=0; i<N; i++) {
            int candidateNum = A.get(i);
            candidateNum -= B;
            totalInspectorCount += 1;

            if (candidateNum > 0) {
                totalInspectorCount += (candidateNum + C - 1) / C;
            }
        }
        System.out.println(totalInspectorCount);
    }
}