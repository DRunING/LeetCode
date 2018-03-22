package DynamicProgramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zenli
 * @link https://leetcode.com/problems/triangle/description/
 */

//使用两个数组进行保存结果
public class Triangle_120 {
    //from top to bottom
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size()  == 0) return 0;
        //last保存上一层最短和
        int[] last = new int[triangle.size()];
        //current计算当前层的和
        int[] current = new int[triangle.size()];
        last[0] = triangle.get(0).get(0);
        current[0] = last[0];
        //横坐标x
        for(int i = 1; i < triangle.size(); i++){
            //纵坐标y
            for(int j = 0; j < i + 1; j++){
                //设置初始值
                int sum = Integer.MAX_VALUE;
                //自顶而下的条件
                if(j != 0){
                    sum = triangle.get(i).get(j) + last[j - 1];
                }
                if(j != i){
                    sum = Math.min(sum, triangle.get(i).get(j) + last[j]);
                }
                current[j] = sum;
            }
            //设置last数组的值
            for(int k = 0; k < i + 1; k++)
                last[k] = current[k];
        }
        int min = Integer.MAX_VALUE;
        for(int n : current){
            min = Math.min(n, min);
        }
        return min;
    }

    //使用二维数组进行保存
    public int use2Array(List<List<Integer>> triangle){
        if(triangle == null || triangle.size() == 0) return 0;
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);
        for(int i  = 1; i < triangle.size(); i++){
            for(int j = 0; j < i + 1; j++){
                int sum = Integer.MAX_VALUE;
                //限制条件
                if(j != 0){
                    sum = triangle.get(i).get(j) + dp[i - 1][j - 1];
                }
                if(j != i){
                    sum = Math.min(sum, triangle.get(i).get(j) + dp[i - 1][j]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int n : dp[triangle.size() - 1]){
            min = Math.min(min, n);
        }
        return min;
    }
}
