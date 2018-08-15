package LeetCode.String;

/**
 * Created by Druning on 2017/9/5.
 * 使用StringBuilder构建String
 */
public class ReverseStringByWord{
    public static String sulution(String s){
        if(s == null || s.trim().isEmpty())
            return "";
        String[] s1 = s.split(" ");
        StringBuilder b = new StringBuilder();
        for(int i = s1.length - 1; i >= 0; i--){
            if(!s1[i].isEmpty()){
                b.append(s1[i]).append(" ");
            }
        }
        return b.substring(0, b.length() - 1);
    }
    public static void main(String[] args){
        System.out.println(sulution(" dd jj k hello "));
    }
}
