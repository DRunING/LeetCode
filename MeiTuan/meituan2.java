package LeetCode.MeiTuan;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author zenli
 */
public class meituan2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] arr = new int[10];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - '0']++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 && i != 0){
                System.out.println(i);
                return;
            }
        }
        int i = 1;
        while(true){
        }
    }
}
