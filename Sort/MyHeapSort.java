package Sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 */
public class MyHeapSort {
    @Test
    public void test(){
        int[] arr = new int[]{4, 6, 2, 8, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr){
        //构建大根堆
        for(int i = arr.length/2 - 1; i >= 0; i--){
            adjustHeap(arr, i, arr.length);
        }

        //调整堆结构，交换栈顶元素与末尾元素
        for(int j = arr.length - 1; j > 0; j--){
            swap(arr, 0, j);
            adjustHeap(arr, 0, j);
        }
    }

    //调整大根堆
    public void adjustHeap(int[] arr, int i, int length){
        int tmp = arr[i];

        //比较左右子节点2i+1和2i+2

        //从2i+1处开始
        for(int k = i * 2 + 1;k < length; k = k * 2 +1){
            if(k + 1 < length && arr[k] < arr[k + 1]){
                k++;
            }
            if(arr[k] > tmp){
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        arr[i] = tmp;
    }


    public void swap(int[] arr, int a, int b){
        int tmp = arr[b];
        arr[b] = arr[a];
        arr[a] = tmp;
    }
}
