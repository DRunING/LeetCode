package weiruan;

import org.junit.Test;

/**
 * @author zenli
 *
 * 注意使用long类型数
 * 判断一个数的开平方是不是整数的方法
 */
public class linkcode728 {
    public boolean isThreeDisctFactors(long n) {
        // write your code here
        int num = 2;
        if(n == 4) return true;
        long x = (long)Math.ceil(Math.sqrt(n));
        if(x * x != n) return  false;
        for(long i  = 2 ; i < Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    @Test
    public void test(){
        System.out.println(isThreeDisctFactors(6));
    }
}
