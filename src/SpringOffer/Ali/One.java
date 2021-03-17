package SpringOffer.Ali;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class One {

    static int res = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        int rows = scanner.nextInt();
        int[][] card = new int[rows][3];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            res = 0;
            dfs(card[i][0], card[i][1], card[i][2], map);
            System.out.println(res);
            res = 0;
        }


    }

    static void dfs(int n, int m, int k, Map<String, Integer> map) {
        if (n == 0 && k == 0) {
            res++;
            res %= (int) 1e9 + 7;
        }

        for (int i = 1; i <= m; i++) {
            if (n < 0 || k < 0) {

                break;
            }
            dfs(n - 1, m, k - i, map);
        }
    }

}
