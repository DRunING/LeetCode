package LeetCode.IntegerArray;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Druning on 2018/1/12.
 */
public class SingleNumber_136 {
    public int sulotion(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
    @Test
    public void test(){

    }
//    public int sulotion1(int[] nums){
//        Map<Integer, >
//    }

    //使用异或操作符
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int x : nums){
            num ^= x;
        }
        return num;
}
}
