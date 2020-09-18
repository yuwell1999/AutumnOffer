package YearOne.Sina;

import java.util.Scanner;

public class EatDonut2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String inp = s.nextLine();
//
//        String []ss = inp.split(" ");
//        int num = Integer.parseInt(ss[0]);
//        int m = Integer.parseInt(ss[1]);
        long num = s.nextLong();
        long m = s.nextLong();


        long[] dp = new long[(int) (num + 1)];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= m; j++) {
                if (i >= j) {
                    dp[i] += dp[i - j];
                }
            }
        }

//        dp[0] = 1;
//        dp[1] = 1;
//        dp[2] = 2;
//
//        for (int i = 3; i < dp.length; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//
//        System.out.println(dp[dp.length - 1]);
        System.out.println(dp[(int) (num)]);
    }
}
