package offer;

/**
 * @author zenli
 */
public class Offer53_FindNumInOrderArray {
    public int solution(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int lb = -1, ub = nums.length;
        while(lb  + 1 < ub ){
            int mid = lb = (ub - lb) / 2;
            if(nums[mid] < target){
                lb = mid;
            }else {
                ub = mid;
            }
        }
        return lb + 1;
    }
}
