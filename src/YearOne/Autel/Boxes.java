package YearOne.Autel;

import java.util.Arrays;
import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int n = s.nextInt();
        s.nextLine();
        //System.out.println(n);
        int[] volumes = new int[n];
        for (int i = 0; i < volumes.length; i++) {
            volumes[i] = s.nextInt();
        }

        Arrays.sort(volumes);
        int[] values = volumes.clone();

        int[] dp = new int[100001];
        //System.out.println(volumes[1]);
        for (Integer i : dp) {
            i = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = V; j >= values[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - values[i]] + values[i]);
            }
        }

        System.out.println(V - dp[V - 1]);
    }
}
