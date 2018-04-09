package exhaustiveSearch;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        if(nums.length == 1) return;

        //使用字典序算法
        int k = -1;
        for(int i = nums.length - 2; i > -1; i--){
            if(nums[i] < nums[i + 1]){
                k = i;
                break;
            }
        }
        if(k == -1){
            Arrays.sort(nums);
            return;
        }
        int l = nums.length -1;
        while(l > k && nums[l] <= nums[k]) l--;

        int tmp = nums[l];
        nums[l] = nums[k];
        nums[k] = tmp;

        reverse(nums, k + 1, nums.length - 1);

    }
    private void reverse(int[] nums, int lb, int ub){
        for(int i = lb, j = ub; i <= j; i++, j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    @Test
    public void test(){
        int[] nums = new int[]{1, 2, 3, 5, 4};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
