package YearOne.Sina;

import java.util.Scanner;

public class EatDonut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();
        int num = 0;
        if (Long.parseLong(inp) > 0) {
            num = Integer.parseInt(inp);
        } else {
            System.out.println(0);
            return;
        }

        if (num == 1) {
            System.out.println(1);
            return;
        }
        if (num == 2) {
            System.out.println(2);
            return;
        }

        long[] dp = new long[num + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[dp.length - 1]);
    }
}
