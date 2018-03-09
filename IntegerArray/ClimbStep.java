package Array;

import org.junit.Test;

/**
 * Created by Druning on 2018/1/11.
 */
public class ClimbStep {
    public int sulotion(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        if(n >= 3) {
            for (int i = 3; i <= n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f[n];
    }
    @Test
    public void test(){
        int result = sulotion(3);
        System.out.println(result);
    }
}
