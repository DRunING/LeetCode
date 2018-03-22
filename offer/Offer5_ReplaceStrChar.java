package offer;

/**
 * @author zenli
 */
public class Offer5_ReplaceStrChar {
    public String solution(String s){
        if(null == s || s.length() <=0) return null;
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') {
                b.append('%');
                b.append('2');
                b.append('0');
            }else {
                b.append(s.charAt(i));
            }
        }
        return b.toString();
    }

    public String repalceByRegex(String s){
        if(null == s || s.length() <= 0) return null;
        return s.replace(" ", "%20");
    }
}
