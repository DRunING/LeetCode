package Sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 */
public class QuickSort {
    //
    public void quickSort1(int[] a, int l, int r ){
        if(l < r){
            int i, j, x;

            i = l;
            j = r;
            x = a[i];
            while(i < j){
                while(i < j && a[j] > x){
                    j--; //从右到左找第一个小于x的数
                }
                if(i < j){
                    a[i++] = a[j];
                }
                while(i < j && a[i] < x){
                    i++; //从左到右找第一个大于x的数
                }
                if(i < j){
                    a[j--] = a[i];
                }
            }
            a[i] = x;  //交换回
            for(int item : a){
                System.out.print(item + " ");
            }
            System.out.println();
            quickSort1(a, l, i - 1);
            quickSort1(a, i + 1, r);
        }

    }

    //
    @Test
    public void test(){
        int[] array = new int[]{2, 6, 5, 3, 1};
        testQuick(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public void testQuick(int[] a, int l, int r){
        if(l < r){
            int i = l, j = r , x = a[i];
            while(i < j){
                while(i < j && a[j] > x){
                    j--;
                }
                if(i < j){
                    a[i++] = a[j];
                }
                while(i < j && a[i] < x){
                    i++;
                }
                if(i < j){
                    a[j--] = a[i];
                }
            }

            //此时完成第一个数排序
            a[i] = x;
            testQuick(a, l, i - 1);
            testQuick(a, i + 1, r);
        }
    }
}
