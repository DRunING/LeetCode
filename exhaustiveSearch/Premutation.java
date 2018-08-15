package LeetCode.exhaustiveSearch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zenli
 *
 * //两种方法，一种使用DFS模板，一种使用字典序的方式
 */
public class Premutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        dfs(nums,list, result);
        return result;
    }
    private void dfs(int[] nums, List<Integer> list, List<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            dfs(nums, list, result);
            list.remove(list.size() - 1);
        }
    }

    @Test
    public void test(){
        System.out.println(dictOrder(new int[]{3 ,4 ,1 ,5}));
    }


    public List<List<Integer>> dictOrder(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;

        //深拷贝一份数组进行复制
        int[] perm = Arrays.copyOf(nums, nums.length);

        Arrays.sort(perm);
        //每次循环将perm按照字典序排列
        while(true){
            List<Integer> tempList = new ArrayList<>();
            for(int i : perm) tempList.add(i);
            result.add(tempList);


            //从后往前找到第一个perm[i] < perm[i + 1]的数
            int k = -1;
            for(int i = perm.length - 2; i >= 0; i--){
                if(perm[i] < perm[i + 1]){
                    k = i;
                    break;
                }
            }

            //整个数组倒序，结束循环
            if(k == -1) break;

            //从后往前找到第一个大于k的数
            int l = perm.length - 1;
            while(l > k && perm[l] <= perm[k]) l--;


            //交换k和l
            int temp = perm[k];
            perm[k] = perm[l];
            perm[l] = temp;


            //将k后面的数字进行反转
            reverse(perm, k + 1, perm.length - 1);
        }
        return result;
    }

    private void reverse(int[] nums, int lb, int ub){
        for(int i = lb, j = ub; i <=j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}
