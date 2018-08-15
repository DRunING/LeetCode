package LeetCode.BinarySearchTree;

/**
 * @author zenli
 * @link http://www.lintcode.com/zh-cn/problem/maximum-subarray/
 */
public class MaximumSubarray_lint41 {
    public int maximumSuarray(int[] nums){
        // 典型的贪心算法
        if(nums == null || nums.length == 0) return 0;
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums){
            //之前的和小于0就抛弃
            sum = Math.max(sum, 0);
            //计算(前序列中整数)当到这个数的最大和并和最大和记录的最大和进行比较
            sum += num;
            maxNum = Math.max(sum, maxNum);
        }
        return maxNum;
    }
}
