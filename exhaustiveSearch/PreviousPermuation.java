package LeetCode.exhaustiveSearch;

import java.util.Collections;
import java.util.List;

/**
 * @author zenli
 */
public class PreviousPermuation {
    public List<Integer> previousPermuation(List<Integer> nums) {
        // write your code here
        if(nums == null || nums.size()  == 0) return nums;
        if(nums.size() == 1) return nums;
//        List<Integer> list = new ArrayList<>();
        int k = -1;
        for(int i = nums.size() - 2; i > -1; i--){
            if(nums.get(i) > nums.get(i + 1)){
                k = i;
                break;
            }
        }
        if(k == -1){
            reverse(nums, 0, nums.size() - 1);
            return nums;
        }
        int l = nums.size() - 1;
        while(l > k && nums.get(k) >= nums.get(l)) l--;

        Collections.swap(nums, k, l);

        reverse(nums, k + 1, nums.size() -1);
        return nums;
    }

    private void reverse(List<Integer> nums, int lb, int ub){
        for(int i = lb, j = ub; i <= j; i++, j--){
            Collections.swap(nums, i, j);
        }
    }
}
