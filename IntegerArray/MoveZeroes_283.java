package LeetCode.IntegerArray;

/**
 * @author zenli
 */
public class MoveZeroes_283 {

    //冒泡排序解决
    public void moveZeroes(int[] nums) {
        if(nums != null && nums.length != 0){
            for(int i = 0 ; i< nums.length; i++){
                for(int j = 1; j < nums.length - i; j++){
                    if(nums[j - 1] == 0){
                        int tmp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
        }
    }
}
