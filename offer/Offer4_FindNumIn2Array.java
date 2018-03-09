package offer;

/**
 * @author zenli
 *
 * 二维数组查找，选取数组右上角（左上角）的数字进行比对，剔除后，再对剩余的矩阵进行比对
 */
public class FindNumIn2Array_4 {
    public boolean solution(int[][] arr, int i){
        if(null == arr | arr.length <= 0) return false;
        int row = 0;
        int column = arr[0].length - 1;
        while(row < arr.length && column >= 0){
            if(i == arr[row][column])
                return true;
            if(i > arr[row][column])
                row++;
            if(i < arr[row][column])
                
        }

    }
}
