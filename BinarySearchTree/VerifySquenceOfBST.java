package LeetCode.BinarySearchTree;

import org.junit.Test;

/**
 * @author zenli
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence == null || sequence.length == 0 ) return false;
        if( sequence.length == 1) return true;
        return judge(sequence, 0, sequence.length - 1);
    }
    //使用递归，判断本质上判断一个数组的元素中大于最后一个元素的位置极其之后的元素都大于最后一个元素
    private boolean judge(int[] arr,int start, int end){
        if(end == start) return true;
        int left = start, right = end - 1;
        for(int i = start ; i <  end; i++){
            if(arr[i] > arr[end]){
                left = (i > start)? i : start;
                right = i;
                for(int j = i; j < end; j++){
                    if(arr[j] < arr[end]) return false;
                }
                break;
            }else{
            }
        }
        return judge(arr, start, left) && judge(arr, right, end - 1);
    }

    @Test
    public void test(){

    }
}
