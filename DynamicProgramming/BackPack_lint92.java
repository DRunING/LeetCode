package DynamicProgramming;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 */
public class BackPack_lint92 {
    public int backPack(int m, int[] A){
        if(A == null || A.length == 0) return 0;
        final int N = A.length;
        final int M = m;
        int[][] dp = new int[N + 1][M + 1];
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j <= M; j++){
                if(A[i] > j){
                    dp[i + 1][j] = dp[i][j];
                }else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - A[i]] + A[i]);
                }
            }
        }
        return dp[N][M];
    }

    @Test
    public void test(){
        int result = backPack(4, new int[]{2, 3, 5, 7});
        System.out.println(result);
    }
}
