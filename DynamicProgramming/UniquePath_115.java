package DynamicProgramming;

import org.junit.Test;

/**
 * @author zenli
 */
public class UniquePath_115 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        final int N = obstacleGrid.length;
        final int M = obstacleGrid[0].length;
        int[][] dp = new int[N + 1][M + 1];
        if(obstacleGrid[0][0] == 1) return 0;
        dp[0][0] = 1;
        for(int i = 1; i < N; i++){
            if(obstacleGrid[i][0] == 1){
                for(int j = i; j < N; j++){
                    dp[i][0] = 0;
                }
                break;
            }
            dp[i][0] = 1;
        }
        for(int i = 1; i < M; i++){
            if(obstacleGrid[0][i] == 1){
                for(int j = i; j < M; j++){
                    dp[0][i] = 0;
                }
                break;
            }
            dp[0][i] = 1;
        }
        for(int i = 1; i < N; i++){
            for(int j = 1; j < M; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[N - 1][M - 1];
    }

    @Test
    public void test(){
        int result = uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});
        assert result == 2;
    }
}
