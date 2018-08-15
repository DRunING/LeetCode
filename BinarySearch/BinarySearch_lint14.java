package LeetCode.BinarySearch;

import org.junit.Test;

/**
 * @author zenli
 */
public class BinarySearch_lint14 {
    public int binarySearch(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int lb = -1, ub = nums.length;
        while(lb + 1 < ub){
            int mid = lb + (ub - lb)/2;
            if(nums[mid] < target){
                lb = mid;
            }else{
                ub = mid;
            }
        }
        if(nums[lb + 1] == target){
            while(lb >= 0 && nums[lb] == target){
                lb--;
            }
            return ++lb;
        }else{
            return -1;
        }
    }

    @Test
    public void test(){
        int result = binarySearch(new int[]{1,4,4,5,7,7,8,9,9,10}, 1);
        System.out.println(result);
    }
}
