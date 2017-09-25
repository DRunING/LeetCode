package array;

/**
 * Created by Druning on 2017/7/11.
 */
public class RemoveElement_27 {
    public static void main(String[] args){
        int[] n1 = {3,2,2,3};
        int[] n2 = {};
        int result = removeElement(n2, 3);
        System.out.println("result:" + result);
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
