package LeetCode.wangyi2017;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author zenli
 */
public class ZhuanKuai {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s == null || s.length() == 0){
            System.out.println(0);
            return;
        }
        s = s.trim();
        int[] arr = new int[26];
        int i = 0;
        for(char c : s.toCharArray()){
            if(arr[c - 'A'] == 0){
                i++;
            }
            arr[c - 'A']++;
        }
        if(i == 1) System.out.println(1);
        if(i == 2) System.out.println(2);
        else System.out.println(0);
    }
    @Test
    public void test(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s == null || s.length() == 0){
            System.out.println(0);
            return;
        }
        s = s.trim();

        char[] arr = new char[26];
        System.out.println(Arrays.toString(arr));
        int i = 1;
        for(char c : s.toCharArray()){
            if(arr[c - 'A'] == 0){
                i++;
            }
        }
        if(i == 1) System.out.println(1);
        if(i == 2) System.out.println(2);
        else System.out.println(0);
    }
}
