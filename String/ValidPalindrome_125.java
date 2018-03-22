package String;

/**
 * Created by Druning on 2017/9/5.
 * 回文串判断，两个指针从两边夹(只计算合法字母)，复杂度O(n)，转换为小写比较
 */
public class ValidPalindrome_125 {
    public static boolean solution(String s) {
//        System.out.println(s.trim());
        if (s == null || s.trim().isEmpty()) {
            return true;
        }
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(solution("asfd;;dfsa"));
        System.out.println(solution("  dsdds';d"));
        System.out.println(solution("dsfaddaad"));
    }
}
