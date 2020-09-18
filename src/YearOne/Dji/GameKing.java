package YearOne.Dji;

import java.util.Scanner;

public class GameKing {
    // 01背包问题
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = 0, X = 0;
        N = s.nextInt();
        X = s.nextInt();

        s.nextLine();

        int[] values = new int[N + 1];
        int[] days = new int[N + 1];

        values[0] = days[0] = 1;
        int[][] t = new int[N + 1][X + 1];

        for (int i = 1; i <= N; i++) {
            values[i] = s.nextInt();
            days[i] = s.nextInt();
            s.nextLine();
        }

        System.out.println(getMaxValue(days, values, t));
    }

    static int getMaxValue(int[] days, int[] values, int[][] t) {
        for (int i = 1; i <= t.length - 1; i++) {
            for (int j = 1; j <= t[0].length - 1; j++) {
                if (days[i] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    t[i][j] = Math.max(t[i][j], t[i - 1][j - days[i]] + values[i]);
                }
            }
        }

        return t[t.length - 1][t[0].length - 1];
    }
}
