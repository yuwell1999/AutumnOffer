package Yonyou;

public class MinPathSum {
    /**
     * 根据输入的m x n 网格，找出一条从左上角到右下角的路径，使得路径上的数字总和为最小，并输出上述路径上的数字最小总和
     *
     * @param grid int整型二维数组
     * @return int整型
     */
    public int minPathSum(int[][] grid) {
        // write code here
//        int[][] dp = new int[grid.length][grid[0].length];
//        for(int i=0;i<grid[0].length;i++){
//            dp[0][i] = grid[0][i];
//        }
//
//
//        for(int i=1;i<grid.length;i++){
//            for(int j=1;j<grid[0].length;j++){
//
//            }
//        }
        int[] dp = new int[grid[0].length];
        dp[0] = grid[0][0];

        for (int i = 1; i < grid[0].length; i++) {
            dp[i] = dp[i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (j == 0) {
                    dp[j] = dp[j] + grid[i][j];
                } else {
                    dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j];
                }
            }
        }
        return dp[grid[0].length - 1];
    }
}
