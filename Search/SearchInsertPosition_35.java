package Search;

/**
 * Created by Druning on 2017/9/24.
 */
public class SearchInsertPosition_35 {


    private static int searchInsert(int[]  nums, int target){
        if(nums == null || nums.length == 0)
            return -1;
// start 和 end分别指向数组前一位和后一位，防止两个整型值相加溢出
        int start = -1, end = nums.length;
        int mid = 0;
// 因为开始时start<end,随意最后一定是start + 1 = end时候退出循环， 同时循环结束时target若存在等于便等于end，否则不存在。
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }
//// 若end还是指向nums的length位置，则不存在该target。（此处为了防止数组溢出）
//        if (end == nums.length || nums[end] != target) {
//            return -1;
//        } else {
//            return end;
//        }


// 此处寻找插入位置，可以越界。
        return end;
    }

    public static void main(String[] args){
        int index = searchInsert(new int[]{1}, 2);
        System.out.println(index);
    }
}

