package exhaustiveSearch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zenli
 */
public class PermutationII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        //剪枝用一个visited标记是否曾经遍历过
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        Arrays.sort(nums);
        dfs(nums, visited,list, result);
        return result;
    }

    public void dfs(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i] || (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1])){
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            dfs(nums, visited,list, result);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }

    @Test
    public void test(){
        System.out.println(permuteUnique(new int[]{1 ,2 ,2, 3}));
    }
}
