package wangyi2017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zenli
 */
public class JIaoCuo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        Arrays.fill(dp, 1);
        for(int i = 1; i < s.length(); i++){
            if(chars[i] == chars[i -1]){
                dp[i]  = 1;
            }else {
                dp[i] = dp[i  - 1] + 1;
            }
        }
        int max = 1;
        for(int i = 0;i < dp.length; i++){
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}
