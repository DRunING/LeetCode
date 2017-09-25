package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Druning on 2017/9/20.
 *  利用哈希表来存储子数列的和
 */
public class ZeroSumSubarry {
    public static void main(String[] args){
        int result = Leetcode560.subarraySum(new int[]{1, 1, 1}, 2);
        System.out.println(result);
    }
    private static int[] solution(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int a = 0;
        int b = 0;
        int allAnd = 0;
        for(int i= 0; i < nums.length;i++){
            if(hm.containsKey(allAnd)){
               a = hm.get(allAnd);
               b = i;
               break;
            }else{
                hm.put(allAnd, i);
            }
            allAnd +=nums[i];
        }
        int[] end = Arrays.copyOfRange(nums, a , b);
        return end;
    }
}
class Leetcode560{
    public static int subarraySum(int[] num, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
//        int tmp = k -0;
        int a = 0;
        int b = 0;
        int allAnd = num[0];
        for (int i = 0; i < num.length; i++) {

            allAnd += num[i];
            if (hm.containsKey(allAnd - k)) {
                a = hm.get(allAnd - k);
                b = i;
                break;
            } else {
                hm.put(allAnd, i);
            }
        }
        int[] end = Arrays.copyOfRange(num, a, b);
//        hm.getOrDefault()1
        return end.length;
    }
    public int subarraySumCopy(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
