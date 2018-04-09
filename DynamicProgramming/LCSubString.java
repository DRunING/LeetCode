package DynamicProgramming;

/**
 * @author zenli
 */
public class LCSubString {
    public int lcsSubString(String a, String b){
        if(a == null || b == null || a.length() == 0 || b.length() == 0) return 0;
        int N = a.length();
        int M = b.length();
        int[][] dp = new int[N + 1][M + 1];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M ;j++){
                if(a.charAt(i) == b.charAt(j)){
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }
            }
        }
        int lcs = 0;
        for(int i = 0; i <=N; i++){
            for(int j = 0; j <= M; j++){
                lcs = Math.max(dp[i][j], lcs);
            }
        }
        return lcs;
    }
}
