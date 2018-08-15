package LeetCode.Sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zenli
 */
public class MyHeapSort {
    @Test
    public void test(){
        int[] arr = new int[]{4, 6, 2, 0, 9, 10, 7, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr){
        //构建大根堆
        for(int i = arr.length/2 - 1; i >= 0; i--){
            adjustHeap(arr, i, arr.length);
        }
        System.out.println("构建的堆为" + Arrays.toString(arr));

        //调整堆结构，交换栈顶元素与末尾元素
        for(int j = arr.length - 1; j >= 0; j--){
            //交换第一个元素和末尾元素
            swap(arr, 0, j);
            //调整堆，从0到j
            adjustHeap(arr, 0, j);
        }
    }

    //调整大根堆

    /**
     *
     * @param arr 构建的数组
     * @param i
     * @param length 要构建的数组的位数( 末尾序号 =  length - 1)
     */
    private void adjustHeap(int[] arr, int i, int length){
        int tmp = arr[i];

        //一个for循环进行比较
        for(int k = i * 2 + 1;k < length; k = k * 2 +1){
            //选出最小的子节点
            if(k + 1 < length && arr[k + 1] >= arr[k]){
                k++;
            }
            if(arr[k] > tmp){
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        //最后选定i
        arr[i] = tmp;
    }


    private void swap(int[] arr, int a, int b){
        int tmp = arr[b];
        arr[b] = arr[a];
        arr[a] = tmp;
    }
    @Test
    public void testMin(){
        int[] arr = new int[]{4, 6, 2, 0, 9, 10, 7, 8};
        MyMinHeapSort.srot(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
class MyMinHeapSort{
    public static void srot(int[] arr){
        for(int i = arr.length / 2 - 1; i >= 0; i--){
            System.out.println(i);
            adjustHeap(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        //调整
        for(int i = arr.length - 1; i >= 0; i--){
            swap(arr, 0, i);
            //调整0 到i - 1 的堆
            adjustHeap(arr, 0, i);
        }
    }
    public static void adjustHeap(int[] arr, int i, int length){
        int tmp = arr[i];

        for(int k = 2 * i +  1; k < length; k = 2 * k + 1){
            if(k + 1 < length && arr[k] >= arr[k + 1]){
                //选出子节点中最小的值
                k++;
            }
            if(arr[k] < tmp){
                arr[i] = arr[k];
                //令i = k 继续比较,直到不再小于跟节点，更新arr[i]
                i = k;
            }else {
                break;
            }
        }
        arr[i] = tmp;

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}