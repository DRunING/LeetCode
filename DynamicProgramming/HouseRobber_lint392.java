package DynamicProgramming;

/**
 * @author zenli
 *
 * sequence DP
 */
public class HouseRobber_lint392 {
    public long houseRobber(int[] A) {
        // write your code here
        if(A == null || A.length == 0) return 0;
        if(A.length == 1) return A[0];
        long[] dp = new long[A.length];
        dp[0] = A[0];
        dp[1] = Math.max(A[0], A[1]);
        for(int i = 2; i < A.length; i++){
            dp[i] = Math.max(dp[i - 2] + A[i], dp[i - 1]);
        }
        return dp[A.length - 1];
    }


}
