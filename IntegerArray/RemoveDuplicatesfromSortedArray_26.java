package LeetCode.IntegerArray;

/**
 * Created by Druning on 2017/7/5.
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args){
        int[] nums = {1,3,21,23,23,23,27};
//        int[] num1 = new int[1];
//        num1[0] = 1;
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] A){
        if (A.length==0) return 0;
        int j=0;
        for (int i=0; i<A.length; i++)
            if (A[i]!=A[j]) A[++j]=A[i];
        return ++j;
    }
}
