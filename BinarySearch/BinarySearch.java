package Search;

/**
 * @author zenli
 */
public class BinarySearch {

    public void BinarySearchLowerUpperBound(){

    }

    //lowerBound实现二分搜索
    public int lowerBound(int[]  nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int lb = -1, ub = nums.length;
        while(lb + 1 < ub){

            //不使用(lb + ub) / 2是为了避免整数溢出
            int mid = lb + (ub - lb) / 2;
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
            if(nums[mid] > target){
                ub = mid;
            }else {
                lb = mid;
            }
        }
        return  ub - 1;
    }
    //最优解  通过二搜索获取最优值
}

