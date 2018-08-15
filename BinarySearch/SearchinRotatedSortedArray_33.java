package LeetCode.BinarySearch;

/**
 * Created by Druning on 2017/9/24.
 */
public class SearchinRotatedSortedArray_33 {
    public static void main(String[] args) {
        int result = solution(new int[]{1, 3}, 3);
        System.out.println(result);
    }
    //首先判断target在哪一部分
    private static int solution(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int divide = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                divide = i;
                break;
            }
        }

        int index;
        if(divide == -1)
            index = search(nums, -1, nums.length, target);
        else if(target < nums[0]){
//            if(divide  > 0)
            index = search(nums, divide , nums.length, target);
        }else {
            index = search(nums, -1, divide + 1, target);
        }

        return index;
    }
// start 要查找数组的前一位， end是要查找数组的末尾位的后一位
    private static int search(int[] nums, int start,  int end, int target){
        int mid = start + 1;
        while(start  +  1 < end){
//循环结束时start +1 = end;
            mid = start  + (end - start)/2;
            if(nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }

        if(end == nums.length || nums[end] != target)
            return -1;
        return end;
    }
}
