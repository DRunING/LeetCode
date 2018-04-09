package wangyi2018;

import java.util.Scanner;

/**
 * @author zenli
 */
public class BianChengTi2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if(n < k) System.out.println(0);
        int num = 0;
        //x >= k
        int x = k;
        // x < y
        num += (1 + n - k) * (n - k) / 2;
        // x > y
        x = k;
        int d;
        while(x <= n) {
            int y = 1;
            while (y < x) {
                if (x % y >= k) {
                    num += x % y -k;
                }
                y = y * 2;
//                if(x % y == k){
//                    y = y * 2;
//                }else {
//                    y++;
//                }
            }
            x++;
        }
        System.out.println(num);
    }
}
