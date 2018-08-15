package LeetCode.String;

import org.junit.Test;

/**
 * @author zenli
 *
 * 字符串匹配，使用DFS遍历进行
 */
public class WildMatching_44 {
    public boolean isMatch(String s, String p){
        if(s == null || p == null) return false;
        if(s.length() == 0 && p.length() == 0) return true;
        return helper(s, 0, p, 0);
    }
    public boolean helper(String s, int si, String p, int pj){

        //递归结束条件
        if((si == s.length()  || pj == p.length())) {
            if(si == s.length() && pj == p.length()){
                return true;
            }else {
                return false;
            }
        }
        //若果pj是*字符进行单独操作
        if(p.charAt(pj) == '*'){
            System.out.println(pj);

            //多个*同一个*的作用一样，进行剔除
            while(p.charAt(pj) == '*'){
                pj++;
                System.out.println(pj);
                if(pj == p.length()) return true;
            }

            //当不等的时候进行同*之间的比较
            while(si < s.length() && !helper(s, si, p, pj)){
                si++;
            }

            return si != s.length();


            //如果是？或者相等字符进行下一步递归操作
        }else if(p.charAt(pj) == '?' || s.charAt(si) == p.charAt(pj)){
            return helper(s, si + 1, p, pj + 1);
        }else {
            return false;
        }
    }
    @Test
    public void test(){
        boolean result = isMatch("", "*");
        System.out.println(result);
    }
}
