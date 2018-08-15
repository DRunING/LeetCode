package LeetCode.String;

/**
 * @author zenli
 *
 * atoi经典题 注意处理边界空白字符串  处理正负号以及边界处理  字符转化为整数的细节
 */
public class Atoi_8 {
    public int atoi(String s){
        if(s == null || s.length() == 0) return 0;
        //处理空白字符
        s = s.trim();
        //positive or negative
        int sign = 1;
        int i = 0;
        if(s.charAt(i) == '+'){
            i++;
        }else if(s.charAt(i) == '-'){
            sign -= 2;
            i++;
        }
        long result = 0;
        for(;i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
                break;
            result =10 *  result + sign * (s.charAt(i) - '0');
            if(result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if(result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        //保证不丢失
        return (int)result;
    }
}
