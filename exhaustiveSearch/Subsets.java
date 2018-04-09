package exhaustiveSearch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zenli
 */
public class Subsets {

    @Test
    public void test() {
        System.out.println(subsets(new int[]{2, 5, 1, 4}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        dfs(nums, 0, list, result);
        return result;
    }

    private void dfs(int[] nums, int pos, List<Integer> list, List<List<Integer>> ret) {
        //用list中的元素作为一个数组加入到ArrayList
        ret.add(new ArrayList<>(list));
        for(int i = pos; i < nums.length; i++){
            list.add(nums[i]);
            dfs(nums, i + 1, list, ret);
            list.remove(list.size() - 1);
        }
    }
}