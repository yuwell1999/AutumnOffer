package Beike;

import java.util.Scanner;

public class bk2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] ans = new int[T];
        for (int i = 0; i < T; i++) {
            int N = s.nextInt();
            int M = s.nextInt();

            if (N % 2 == 0 || M % 2 == 0) {
                System.out.println(2);
                ans[i] = Math.max(helper(N), helper(M));
            } else {
                System.out.println(Math.min(helper(N), helper(M)));
                ans[i] = Math.min(helper(N), helper(M));
                ans[i] = 2;
            }
        }

    }


    public static int helper(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
