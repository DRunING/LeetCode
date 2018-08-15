package LeetCode.exhaustiveSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zenli
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        //排序，排除重复元素
        Arrays.sort(nums);
        dfs(nums, 0, result, list);
        return result;
    }

    private void dfs(int[] nums, int pos, List<List<Integer>> result, List<Integer> list){
        result.add(new ArrayList<>(list));
        for(int i = pos; i < nums.length; i++){
            if(i != pos && nums[i] == nums[i - 1]){
                continue;
            }
            list.add(nums[i]);
            dfs(nums, pos + 1, result, list);
            list.remove(list.size() - 1);
        }
    }
}
