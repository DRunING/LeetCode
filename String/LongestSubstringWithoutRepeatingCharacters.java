package LeetCode.String;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Druning on 2018/1/9.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    @Test
    public void test(){
        int result =  lengthOfLongestSubstring("abcabcbb");
//        int result1 = lengthOfLongestSubstring("au");
////        System.out.println(result);
        int result2 = lengthOfLongestSubstring("dvdf");
//        System.out.println(result1);
//        System.out.println(result);
//        System.out.println(result2);
//        int result3 = lengthOfLongestSubstring("pwwkew");
        System.out.println(result2);
    }

    /**
     * 求一个字符串的最长无重复子串
     * 思路：使用fast和slow两个指针，同时用set存储元素
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int fast = 0;
        int slow = 0;
        int size = 0;
        int tmp = 0;
        Set<Character> chars = new HashSet<Character>();
        for(; fast < s.length(); fast++){
            if(chars.contains(s.charAt(fast))){
//                System.out.println(chars);
                //current the size is max
                if(tmp > size)
                    //compare the size
                    size = tmp;
                //remove the char and move the slow pointer
                while(s.charAt(slow) != s.charAt(fast)){
                    chars.remove(s.charAt(slow));
                    slow++;
                }
                chars.remove(s.charAt(slow));
                slow++;
                chars.add(s.charAt(fast));
                tmp = fast - slow + 1;
            }else{
                chars.add(s.charAt(fast));
                tmp++;
            }
        }
        return size > tmp? size : tmp;
    }
}
