package YearOne.Mihayo;

import java.util.Scanner;

public class ZeroOneMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M = 0, N = 0;
        M = s.nextInt();
        N = s.nextInt();

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            //matrix[i] = s.nextLine().split("");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[j][i] == 1) {
                    ans[i] = 1;
                }
            }
        }

        boolean flag = true;

        for (Integer i : ans) {
            if (i != 1) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
