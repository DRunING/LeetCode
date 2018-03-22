package String;

/**
 * @author zenli
 */
public class LongestPalindromicSubstring_5 {
    public String longestPalindromicSubstring(String s){
        if(s == null || s.isEmpty()) return "";
        int longest = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
// odd
            int leftIndex = leftPalindromeIndex(s, i, i);
            int palindromeLen = 2 * (i - leftIndex) + 1;
            if (palindromeLen > longest) {
                left = leftIndex;
                longest = palindromeLen;
            }
// even
            leftIndex = leftPalindromeIndex(s, i, i + 1);
            palindromeLen = 2 * (i - leftIndex + 1);
            if (palindromeLen > longest) {
                left = leftIndex;
                longest = palindromeLen;
            }
        }
        return s.substring(left, left + longest);
    }

    private int leftPalindromeIndex(String s, int left, int right) {
        for (; left >= 0 && right < s.length(); left--, right++) {
            if (s.charAt(left) != s.charAt(right)) break;
        }
        return left + 1;
    }
}
