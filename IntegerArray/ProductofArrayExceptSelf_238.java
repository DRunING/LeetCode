package IntegerArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 */
public class ProductofArrayExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int num = 1;
        int numOf0 = 0;
        int indexOf0 = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0){
                numOf0++;
                indexOf0 = i;
                if(numOf0 == 2){
                    return new int[nums.length];
                }
            }else{
                num *= nums[i];
            }
        }
        if(numOf0 == 1){
            for(int i = 0; i < nums.length; i++){
                if(i == indexOf0){
                    nums[i] = num;
                }else{
                    nums[i] = 0;
                }
            }
        }else{
            for(int i = 0; i < nums.length;i++){
                nums[i] = num / nums[i];
            }
        }
        return nums;
    }
    @Test
    public void test(){
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3})));
    }
}
