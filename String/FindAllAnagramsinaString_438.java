package String;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Druning on 2017/12/12.
 */
public class FindAllAnagramsinaString_438 {
    @Test
    public void test(){
        System.out.print(solution("ababa", "ab"));
    }
    public List<Integer> solution(String s, String p){
        int[] hash = new int[256];
        List<Integer> list = new ArrayList<>();
        for(char a : p.toCharArray()){
            hash[a]++;
        }
        int left = 0, right = 0, count = p.length();
        while(right < s.length()){
            if(hash[s.charAt(right++)]-- >= 1)
                count--;
            if(count == 0) list.add(left);
            if(right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;
    }
}
