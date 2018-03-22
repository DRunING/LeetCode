package IntegerArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Druning on 2018/1/10.
 */
public class Sum_18 {
    public List<List<Integer>> sulotion(int[]  nums, int target){
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4) return res;
        Arrays.sort(nums);
        for(int i = 0;  i < nums.length - 3; i++){
            if(nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break; //too little,break
            if(nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target)
                continue;//too little
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.length - 2; j++){
                if(nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if(nums[i] + nums[j] + nums[nums.length - 2] + nums[nums.length  - 1] < target) continue;
                if( j > i + 1 && nums[j] == nums[j - 1]) continue;
                //convert to the 3 num add
                int low = j + 1, high = nums.length -1;
                while(low < high){
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    System.out.println(i + " "+ j +" "  + low + " "+ high);
                    if(sum == target){
                        res.add(Arrays.asList(nums[i] , nums[j] , nums[low] , nums[high]));
                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    }else if(sum < target) low++;
                    else high--;
                }
            }
        }
        return res;
    }
    @Test
    public void test(){
        List<List<Integer>> result =sulotion(new int[]{1,0,-1,0,-2,2, 3},  0);
        List<List<Integer>> result1 =sulotion1(new int[]{1,0,-1,0,-2,2, 3},  0);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public List<List<Integer>> sulotion1(int[] num, int target){
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(num.length<4)return ans;
        Arrays.sort(num);
        for(int i=0; i<num.length-3; i++){
            if(num[i]+num[i+1]+num[i+2]+num[i+3]>target)break; //first candidate too large, search finished
            if(num[i]+num[num.length-1]+num[num.length-2]+num[num.length-3]<target)continue; //first candidate too small
            if(i>0&&num[i]==num[i-1])continue; //prevents duplicate result in ans list
            for(int j=i+1; j<num.length-2; j++){
                if(num[i]+num[j]+num[j+1]+num[j+2]>target)break; //second candidate too large
                if(num[i]+num[j]+num[num.length-1]+num[num.length-2]<target)continue; //second candidate too small
                if(j>i+1&&num[j]==num[j-1])continue; //prevents duplicate results in ans list
                int low=j+1, high=num.length-1;
                while(low<high){
                    int sum=num[i]+num[j]+num[low]+num[high];
                    if(sum==target){
                        ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                        while(low<high&&num[low]==num[low+1])low++; //skipping over duplicate on low
                        while(low<high&&num[high]==num[high-1])high--; //skipping over duplicate on high
                        low++;
                        high--;
                    }
                    //move window
                    else if(sum<target)low++;
                    else high--;
                }
            }
        }
        return ans;
    }
}
