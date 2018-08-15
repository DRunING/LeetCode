package LeetCode.DynamicProgramming;

import org.junit.Test;

/**
 * @author zenli
 */
public class Min_PathSum_lint110 {
    public int minPathSum(int[][] grid) {
        // write your code here
        final int M = grid.length;
        final int N = grid[0].length;
        int[][] dp = new int[M + 1][N + 1];

        //双序列初始化
        dp[0][0] = grid[0][0];
        for(int i = 1; i < M; i++){
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for(int j = 1; j< N; j++){
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        //套入递推公式
        for(int i = 1; i < M; i++){
            for(int j = 1; j < N; j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[M - 1][N - 1];
    }

    @Test
    public void test(){
        int result = minPathSum(new int[][]{{2, 3, 2, 1}, {4, 3, 1, 2}, {5, 3, 2, 3}});
        System.out.println(result);
    }
}
