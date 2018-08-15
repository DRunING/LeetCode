package LeetCode.DynamicProgramming;

import org.junit.Test;

/**
 * @author zenli
 */
public class BackpackII_link125 {
    public int backpackII(int m, int[] A, int[] V){
        if(A == null || A.length != V.length || A.length == 0) return 0;
        final int M = m;
        final int N = A.length;
        int[][] dp = new int[N + 1][M + 1];

        //多算一位，第i个物品为A[i - 1]， 即第N个物品为A[N - 1]
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= M; j++){
                if(A[i] > j){
                    dp[i + 1][j] = dp[i][j];
                }else {
                    dp[i + 1][j] =  Math.max(dp[i][j], dp[i][j - A[i]] + V[i]);
                }
            }
        }
        return dp[N][M];
    }
    @Test
    public void test(){
        int result = backpackII(10, new int[]{2, 3, 5, 6}, new int[]{1, 5, 2, 4});
        System.out.println(result);
    }
}
