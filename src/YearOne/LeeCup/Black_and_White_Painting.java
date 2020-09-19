package YearOne.LeeCup;

import java.util.HashMap;
import java.util.Map;

public class Black_and_White_Painting {
    public static void main(String[] args) {
        int n = 6;
        int k = 28;
        System.out.println(paintingPlan(n, k));
    }

    public static int paintingPlan(int n, int k) {
        if (k == 0) {
            return 1;
        }

        int ans = 0;

        if (k < n) {
            return 0;
        } else if (n * n == k) {
            return 1;
        } else {
            // s列，c行，网格长度为n，一共有n(s+c)-sc个黑色格子
            // 找n(s+c)-sc = k 的解(s,c)
            Map<Integer, Integer> map = new HashMap<>();

            for (int s = 0; s < n; s++) {
                for (int c = 0; c < n; c++) {
                    if (k == n * (s + c) - s * c) {
                        //System.out.println("s="+s+"c="+c);
                        map.put(s, c);
                    }
                }
            }

            for (int i : map.keySet()) {
                ans += (comb(n, i) * comb(n, map.get(i)));
            }

        }

        return ans;
    }

    private static long comb(int m, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return m;
        if (n > m / 2)
            return comb(m, m - n);
        if (n > 1)
            return comb(m - 1, n - 1) + comb(m - 1, n);
        return -1; //通过编译需要，数字无实际意义}
    }
}
