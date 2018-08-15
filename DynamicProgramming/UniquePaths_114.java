package LeetCode.DynamicProgramming;

import org.junit.Test;

/**
 * @author zenli
 */
public class UniquePaths_114 {
    public int uniquePaths(int m, int n){
        final int M = m;
        final int N = n;
        int[][] dp = new int[M + 1][N + 1];
        for(int i = 0; i < M; i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < N; j++){
            dp[0][j] = 1;
        }
        for(int i = 1; i < M; i++){
            for(int j = 1; j < N; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[M - 1][N - 1];
    }
    @Test
    public void test(){
        int result = uniquePaths(4, 5);
        System.out.println(result);
    }
}
