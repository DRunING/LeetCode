package String;

import org.junit.Test;

/**
 * @author zenli
 */
public class ImplementstrStr_28 {
    public int strStr(String haystack, String needle){
        if(haystack == null && needle == null) return 0;
        if(haystack == null) return -1;
        if(needle == null) return 0;
        if(needle.length() == 0) return 0;
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            for(int j = 0; j < needle.length(); j++){
                if(needle.charAt(j) == haystack.charAt(j + i)){
                    System.out.println(j);
                    if(j == needle.length() - 1){
                        return i;
                    }
                }else {
                    break;
                }
            }
        }
        return -1;
    }

    @Test
    public void test(){
        int result = strStr("", "");
        System.out.println(result);
    }
}
