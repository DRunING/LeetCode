package LeetCode.MianShiTi.TengXun2017;

import java.util.Scanner;

/**
 * @author zenli
 */
public class GouZaoHuiWen {
    public int gouZaoHuiWen(){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        StringBuilder s2Builder = new StringBuilder();
        int N = s1.length();
        for(int i = s1.length();i >= 0; i--){
            s2Builder.append(s1.charAt(i));
        }
        String s2 = s2Builder.toString();
        int[][] dp = new int[N + 1][N + 1];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; i++){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                }else{
                    dp[i + 1][j + 1] = Math.max(dp[i][j +  1], dp[i + 1][j]);
                }
            }
        }
        return dp[N][N];
    }
}
