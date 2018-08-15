package LeetCode.BinarySearch;

import org.junit.Test;

/**
 * @author zenli
 */
public class BinarySearch {

    //lowerBound实现二分搜索
    public int lowerBound(int[]  nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int lb = -1, ub = nums.length;
        while(lb + 1 < ub){

            //不使用(lb + ub) / 2是为了避免整数溢出
            int mid = lb + (ub - lb) / 2;
            //下界模板，判断小于
            if(nums[mid] < target){
                lb = mid;
            }else {
                ub = mid;
            }
        }
        //返回lb + 1
        return lb  + 1;
    }

    //upperBound实现二分搜索
    public int upperBound(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int lb = -1, ub = nums.length;
        while(lb + 1< ub){
            int mid = lb + (ub - lb) / 2;
            //上界模板，判断大于
            if(nums[mid] > target){
                ub = mid;
            }else {
                lb = mid;
            }
        }
        return  ub - 1;
    }
    //最优解  通过二搜索获取最优值


//    @Test
//    public int testBinary(int[] arr, int target){
//        int lb = -1, ub = arr.length;
//        while(lb + 1< ub ){
//            int mid = lb + (ub - lb) / 2;
//            if(arr[mid] < target){
//                lb = mid;
//            }else {
//                ub = mid;
//            }
//        }
//        return lb + 1;
//    }
//
//    @Test
//    public int testBinaryUpper(int[] arr, int target){
//        int lb = -1, ub = arr.length;
//        while(lb + 1< ub){
//            int mid = lb + (ub - lb) / 2;
//            if(mid > target){
//                ub = mid;
//            }else {
//                lb = mid;
//            }
//        }
//        return ub - 1;
//    }
}

