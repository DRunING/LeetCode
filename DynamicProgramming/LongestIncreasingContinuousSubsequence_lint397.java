package DynamicProgramming;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 * @link http://www.lintcode.com/zh-cn/problem/longest-increasing-continuous-subsequence/
 * dp[i]表示包含到dp[i]的包含dp[i]的最长序列
 */
public class LongestIncreasingContinuousSubsequence_lint397 {
    public int longestIncreasingContinuousSubsequence(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int[] dp1 = new int[nums.length];
        //填满数组
        Arrays.fill(dp, 1);
        Arrays.fill(dp1, 1);
        //递增的情况
        for(int i  = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i])
                dp[i] = dp[i - 1] + 1;
        }
        //递减的情况
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > nums[i])
                dp1[i] = dp1[i - 1] + 1;
        }
        int max = 1;
        for(int i = 0;i < nums.length; i++){
            max = Math.max(Math.max(dp[i], dp1[i]), max);
        }
        return max;
    }

    @Test
    public void test(){
        int result = longestIncreasingContinuousSubsequence(new int[]{3, 5, 2, 7, 2});
        System.out.println(result);
    }
}
