package LeetCode.BinarySearch;

/**
 * @author zenli
 */
public class FirstBadVersion_278 {

    //use low bound实现寻找最早的错误版本
    public int solution(int n){
        int lb = 0, ub = n;
        while(lb  < ub){
            int mid = lb + (ub - lb) / 2;
            if(!isBadVersion(mid)){
                lb = mid + 1;
            }else {
                ub = mid;
            }
        }
        return lb;
    }
    public boolean isBadVersion(int n){
        return true;
    }


//    public int solution(int n){
//        int lb = 0, ub = n;
//        while(lb + 1 <= ub){
//            int mid = lb + (ub - lb) / 2;
//            if(isBadVersion(mid)){
//                lb = mid;
//            }else {
//                ub = mid;
//            }
//        }
//        return lb;
//    }
}
