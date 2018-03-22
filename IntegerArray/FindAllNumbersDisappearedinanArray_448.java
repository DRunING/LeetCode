package IntegerArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zenli
 */
public class FindAllNumbersDisappearedinanArray_448 {
    public List<Integer> solution(int[] nums){
        int[] tmp = new int[nums.length + 1];
        for(int i = 0; i< nums.length; i++){
            tmp[nums[i]]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < tmp.length; i++){
            if(tmp[i] == 0)
                list.add(i);
        }
        return list;
    }

    @Test
    public void test(){
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(solution(arr));
    }
}
