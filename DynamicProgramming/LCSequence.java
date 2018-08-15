package LeetCode.DynamicProgramming;

import org.junit.Test;

/**
 * @author zenli
 * O(n2)
 * 最长公共子序列
 */
public class LCSequence {
    public int lcs (String a, String b){
        if(a == null || b == null || a.length() == 0 || b.length() == 0) return 0;
        int N = a.length();
        int M = b.length();
        int[][] dp = new int[N + 1][M + 1];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(a.charAt(i) == b.charAt(j)){
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                }else {
                    dp[i +  1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[N][M];
    }
    @Test
    public void test(){
        int result = lcs("treee", "tre");
        System.out.println(result);
    }
}
