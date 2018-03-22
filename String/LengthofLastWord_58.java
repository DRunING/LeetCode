package String;

import org.junit.Test;

/**
 * @author zenli
 */
public class LengthofLastWord_58 {
    public int lengthOfLastWord(String s){
        if(s == null || s.length() == 0) return 0;
        String[] strings= s.trim().split(" ");
        if(strings.length == 0) return 0;
        return strings[strings.length - 1].length();
    }

    @Test
    public void test(){
        System.out.println(lengthOfLastWord("heelo word"));
    }
}
