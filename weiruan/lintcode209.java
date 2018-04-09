package weiruan;

import org.junit.Test;

/**
 * @author zenli
 *
 * 字符加一个整数是一个整数，字符串加一个整数是一个字符串
 */
public class lintcode209 {
    public char firstUniqChar(String str) {
        // Write your code here
        if(str == null || str.length() == 0) return 0;
        char[] chars = new char[26];
        String s = str.trim();
        for(int i  = 0 ; i < s.length(); i++){
            chars[s.charAt(i) - 'a']++;
        }
        for(int i  = 0; i < chars.length; i++){
            if(chars[i] == 1){
                return (char)('a' + i);
            }
        }
        return 0;
    }

    @Test
    public void test(){
        System.out.println(firstUniqChar("dsfaads"));
    }
}
