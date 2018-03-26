package wangyi2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author zenli
 */
public class CaoZuoXuLie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i  = 0; i < num; i++){
            list.add(in.nextInt());
        }
        int[] res = new int[list.size()];
        int right = res.length - 1;
        int left = 0;
        for(int i = list.size() -1; i >= 0;){
            if(i == 0){
                res[left] = list.get(i);
                break;
            }else {
                res[left++] = list.get(i--);
                res[right--] = list.get(i--);
            }
        }
        for(int i = 0;i < res.length - 1; i++){
            System.out.print(res[i] + " ");
        }
        System.out.print(res[res.length - 1] + "\n");
    }
}
