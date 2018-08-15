package LeetCode.String;

/**
 * Created by Druning on 2017/9/20.
 * LeetCode242  用大小为26的数组存储一个字符串中相对于字母‘a'的偏移数，然后进行判断anagram（相同的字母）
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String m){
        int[]  bucket = new int[26];
        for(int i = 0; i < s.length(); i++){
            bucket[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < m.length(); i++){
            bucket[m.charAt(i)- 'a']--;
        }
        for(int i : bucket){
            if(i != 0)
                return false;
        }
        return true;
    }
    public boolean LeetCode242(String s, String m){
        int[]  bucket = new int[26];
        for(int i = 0; i < s.length(); i++){
            bucket[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < m.length(); i++){
            bucket[m.charAt(i)- 'a']--;
        }
        for(int i : bucket){
            if(i != 0)
                return false;
        }
        return true;
    }
}
