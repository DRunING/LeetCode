package LeetCode.weiruan;

import org.junit.Test;

/**
 * @author zenli
 * 用了两个数组记录变更前后的状况
 */
public class lintcode702 {
    public String concatenetedString(String s1, String s2) {
        // write your code here
        int[] chars = new int[26];
        int[] chars2 = new int[26];
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            chars[s2.charAt(i)- 'a']++;
            chars2[s2.charAt(i)- 'a']++;
        }
        for(int i = 0; i < s2.length();i++){
            if(chars[s1.charAt(i) - 'a'] == 0){
                builder1.append(s1.charAt(i));
            }else {
                chars2[s1.charAt(i) - 'a'] = 0;
            }
        }

        for(int i = 0;i < s2.length(); i++){
            if(chars2[s2.charAt(i) - 'a'] != 0)
                builder2.append(s2.charAt(i));
        }
        return builder1.toString() + builder2.toString();
    }

    @Test
    public void test(){
        System.out.println(concatenetedString("aacb", "gafd"));
    }
}
