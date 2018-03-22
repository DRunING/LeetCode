package DynamicProgramming;

import org.junit.Test;

/**
 * @author zenli
 * @link http://www.lintcode.com/zh-cn/problem/house-robber-ii/
 */
public class HouseRobberII_lint534 {
    public int houseRobberII(int[] nums){
        // write your code here
        if(nums == null || nums.length == 0) return 0;

        //corner case
        if(nums.length == 1) return nums[0];
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        if(nums.length == 3){
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }
        int[] dp = new int[nums.length];

        //分两种情况比较
        dp[0] = nums[0];

        //case 1  without nums[0]
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);
        for(int i = 3;i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        int case1= dp[nums.length - 1];

        //case 2 with nums[0]
        dp[1] = nums[0];
        dp[2] = nums[0] + nums[2];
        for(int i = 2; i < nums.length - 1; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        int case2 = dp[nums.length - 2];

        return Math.max(case1, case2);
    }


    @Test
    public void test(){
        int result = houseRobberII(new int[]{3,6,4});
        System.out.println(result);
    }
    @Test
    public void test2(){
        int result = houseRobberII(new int[]{3, 5, 1, 2, 3});
        System.out.println(result);
    }
}
