package weiruan;

import org.junit.Test;

/**
 * @author zenli
 *
 * 最小数组反转数
 *
 * 从后往前，
 */
public class lintcode843 {
    public int flipDigit(int[] nums) {
        // Write your code here
        int length = nums.length;
        int dp[] = new int[nums.length];
        dp[length - 1] = 0;
        for(int i = length - 2; i >= 0; i--){
            if(nums[i + 1] == 1 && nums[i] == 0){
                dp[i] = dp[i + 1] + 1;
                nums[i] = 1;
            }else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
    }

    @Test
    public void test(){
        System.out.println(flipDigit(new int[]{1,0,0,1,1,1}));
        System.out.println(flipDigit(new int[]{1,0,1,0,1,0}));
    }
}
