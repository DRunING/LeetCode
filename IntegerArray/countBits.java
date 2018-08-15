package LeetCode.IntegerArray;

import org.junit.Test;

import java.util.Arrays;

public class countBits {
    public int[] sulotion(int num){
        //储存数组
        int[] f = new int[num+1];
        //移位操作
        for(int i = 1; i <= num; i++){
            f[i] = f[i >> 1] + (i & 1);
            System.out.println(i & 1);
        }
        return f;
    }
    @Test
    public void test(){
        System.out.println(Arrays.toString(sulotion(10)));
    }
}
