package BinarySearch;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 */
public class SearchforaRange_34 {
    public int[] solution(int[] nums, int target){
        int[] result = {-1, -1};
        if(nums == null || nums.length == 0) return result;
        int lb = -1, ub = nums.length;

        //lower bound
        while(lb + 1 < ub){

            //不使用(lb + ub) / 2是为了避免整数溢出
            int mid = lb + (ub - lb ) / 2;
            if(nums[mid] < target){
                lb = mid;
            }else {
                ub = mid;
            }
        }
        if((lb + 1 < nums.length && nums[lb + 1] == target)){
            result[0] = lb + 1;
        }else {
            return result;
        }

        //upper bound
        lb = -1;
        ub = nums.length;
        while(lb + 1 <ub){
            int mid = lb + (ub - lb) / 2;
            if(nums[mid] > target){
                ub = mid;
            }else {
                lb = mid;
            }
        }
        result[1] = ub - 1;
        return result;
    }
    @Test
    public void test(){
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] result = solution(nums, 7);
        System.out.println(Arrays.toString(result));
    }
}
