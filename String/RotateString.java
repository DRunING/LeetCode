package LeetCode.String;

/**
 * Created by Druning on 2017/9/5.
 */
public class RotateString {
    public static char[] rotateString(String s, int offset){
        int len = s.length();
        offset %= len;
        char[] charOfs = s.toCharArray();
        reverse(charOfs, 0, len - offset -1);
        reverse(charOfs, len - offset, len - 1);
        reverse(charOfs, 0, len - 1);
        String result = charOfs.toString();
        return charOfs;
    }
    public static void main(String[] args){
        String s = "abcdef";
        System.out.println(rotateString(s, 2));

    }
    //reverse字符串模板
    private static void reverse(char[] A, int start, int stop){
        while(start < stop){
            char tmp = A[start];
            A[start] = A[stop];
            A[stop] = tmp;
            start++;
            stop--;
        }
    }
}
