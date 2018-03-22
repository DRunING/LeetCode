package IntegerArray;

import java.util.Arrays;

/**
 * @author zenli
 * @link http://www.lintcode.com/zh-cn/problem/triangle-count/
 * O(nlogn) +O(n)
 */
public class TrianCount {
    public int triangleCount(int[] s) {
        // write your code here
        Arrays.sort(s);
        int left = 0, right = s.length - 1;
        int ans = 0;
        for(int i = 0; i < s.length; i++){
            left = 0;
            right = i - 1;
            while(left < right){
                if(s[left] + s[right] > s[i]){
                    ans = ans + (right - left);
                    right--;
                } else{
                    left++;
                }
            }
        }
        return ans;
    }
}
