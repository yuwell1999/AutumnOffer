package YearOne.Pingan;

import java.util.Scanner;

public class Cow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 1 || n == 2 || n == 3) {
            System.out.println(n);
        } else {
            int[] ans = new int[n + 1];

            ans[0] = 0;
            ans[1] = 1;
            ans[2] = 2;
            ans[3] = 3;

            for (int i = 4; i <= n; i++) {
                ans[i] = ans[i - 1] + ans[i - 3];
            }

            System.out.println(ans[n]);
        }
    }
}
