package LeetCode.String;

/**
 * Created by Druning on 2017/9/23.
 */
public class ReverseString_344 {
    private static String reverse(String s){
        if(s.isEmpty())
            return s;
        char[] c =  s.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = c.length -1; i >= 0; i--){
            result.append(c[i]);
        }

        return result.substring(0);
    }

    public static void main(String[] args){
        String result = reverse("dfa");
        System.out.println(result);
        String result1 = reverse("");
        System.out.println(result1);
    }
}
