package YearOne.Bilibili;

public class MaxProfit {
    /**
     * 黄金投资
     *
     * @param prices int整型一维数组 价格
     * @return int整型
     */
    public int maxProfit(int[] prices) {
        // write code here
        int n = prices.length;
        if (n < 1) {
            return 0;
        }

        int[][] f = new int[n + 1][5 + 1];
        int i, j, k;
        f[0][1] = 0;

        for (i = 2; i <= 5; i++) {
            f[0][i] = Integer.MIN_VALUE;
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j < 6; j += 2) {
                f[i][j] = f[i - 1][j];
                if (i > 1 && j > 1 && f[i - 1][j - 1] != Integer.MIN_VALUE) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + prices[i - 1] - prices[i - 2]);
                }
            }

            for (j = 2; j < 6; j += 2) {
                f[i][j] = f[i - 1][j - 1];
                if (i > 1 && f[i - 1][j - 1] != Integer.MIN_VALUE) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j] + prices[i - 1] - prices[i - 2]);
                }
                if (j > 2 && f[i - 1][j - 2] != Integer.MIN_VALUE) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 2] + prices[i - 1] - prices[i - 2]);
                }
            }
        }

        return Math.max(f[n][1], Math.max(f[n][3], f[n][5]));

    }
}