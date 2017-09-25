package String;

/**
 * Created by Druning on 2017/9/5.
 */
public class LongestCommonSubstring {
    public static int forceMethod(String a, String b){
        if((a == null || a.isEmpty()) || (b ==null || b.isEmpty()) )
            return 0;
        int lcs = 0;
        for(int i = 0; i < a.length(); i++){
            int lcs_tmp = 0;
            for(int j = 0; j < b.length(); j++){
                while(i + lcs_tmp < a.length() && j + lcs_tmp < b.length() && a.charAt(i + lcs_tmp) == b.charAt(j + lcs_tmp)){
                        lcs_tmp++;
                }
            }
            if(lcs < lcs_tmp)
                lcs = lcs_tmp;
        }
        return lcs;
    }
    public static void main(String[] args){
        int result = forceMethod("dfdsafds", "dsa");
        System.out.println(result);
    }
}
