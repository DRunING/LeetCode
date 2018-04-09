package jiuzhang.dp;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zenli
 */
public class lintcode_107 {
    public boolean wordBreak(String s, Set<String> dict){
        boolean[] dp = new boolean[s.length()];
        dp[0] = dict.contains(s.substring(0, 1));

        for(int i  = 1; i < s.length(); i++){
            if(dict.contains(s.substring(0, i + 1))){
                dp[i] = true;
                continue;
            }
            for(int j = i - 1;j  >= 0; j--){
                if(dp[j]){
                    if(dict.contains(s.substring(j + 1, i + 1))){
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
    @Test
    public void test(){
        Set<String> dict = new HashSet<>();
        dict.add("ab");
        dict.add("aa");
        String s =  "aaab";
        boolean result = wordBreak(s, dict);
        System.out.println(result);
    }
}
