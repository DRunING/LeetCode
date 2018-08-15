package LeetCode.IntegerArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zenli
 * @link https://leetcode.com/problems/3sum/description/
 * @link http://www.lintcode.com/zh-cn/problem/3sum/
 */
public class Sum_15 {
    public static List<List<Integer>> solution(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        //先排序
        Arrays.sort(nums);
        //用Arrays工具类进行转化到字符打印
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int lo = i + 1, h1 = nums.length - 1, sum = 0 - nums[i];
                while(lo < h1){
                    if(nums[lo] + nums[h1] == sum){
                        //Arrays工具类转化为ArrayList
                        result.add(Arrays.asList(nums[i],nums[lo], nums[h1]));
                        while(lo < h1 && nums[lo] == nums[lo + 1]) lo++;
                        while(lo < h1 && nums[h1] == nums[h1 - 1]) h1--;
                        lo++;
                        h1--;
                    }else if(nums[lo] + nums[h1] < sum) lo++;
                    else h1--;
                }
            }
        }
        return result;
    }
    @Test
    public void test(){
        int[] nums = new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> result =  solution(nums);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
