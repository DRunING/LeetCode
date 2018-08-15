package LeetCode.MeiTuan;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author zenli
 */
public class meituan1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        //假设chars1长于chars2
        char[] chars2  = s2.toCharArray();
        int result = 0;
        int len = s2.length();
        for(int i = 0; i < s1.length() - s2.length() + 1; i++){
            char[] chars1 = s1.substring(i, len + i).toCharArray();
//            System.out.println(i);
            result +=  diff(chars1, chars2);
        }
        System.out.println(result);
    }
    private static int diff(char[] s1, char[] s2){
//        System.out.println(s1 +  "  +  " + s2);
        int num = 0;
        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s2[i]){
                num++;
            }
        }
        return num;
    }
}
