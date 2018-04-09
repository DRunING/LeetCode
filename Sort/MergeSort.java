package Sort;

import org.junit.Test;

/**
 * @author zenli
 */
public class MergeSort {
    public void mergeSort(int[] array){
        sort(array, 0, array.length - 1);
    }

    public void merge(int[] array, int low, int mid, int high){
        int[] helper = new int[array.length];
        //copy array to helper
        for(int k = low; k <= high; k++){
            helper[k] = array[k];
        }
        //merge
        int i = low, j = mid + 1;
        for(int k = low; k <= high; k++){
            if(i > mid){
                array[k] = helper[j];
                j++;
            }else if(j > high){
                array[k] = helper[i];
                i++;
            }else if(helper[i] > helper[j]){
                array[k] = helper[j];
                j++;
            }else {
                array[k] = helper[i];
                i++;
            }
        }
    }

    public void sort(int[] array, int low, int high){
        if(high <= low) return;
        int mid = low + (high - low) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @Test
    public void test(){
        int[] array = new int[]{6, 5, 3, 1, 8, 7, 2};
        mergeSort(array);
    }

    public void exam(int[] array){

    }
}
