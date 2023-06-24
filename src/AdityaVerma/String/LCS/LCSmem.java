package AdityaVerma.String.LCS;

import java.util.Arrays;

public class LCSmem {
    static int dp[][] = new int[101][101];
    public static void main(String[] args) {
        for(int []rows:dp)
            Arrays.fill(rows, -1);
        System.out.println(LCS("rishabh", "rishabh", 7, 7));
    }

    private static int LCS(String a, String b, int m, int n) {
        if(m==0 || n==0)
            return 0;

        if(dp[m][n] != -1)
            return dp[m][n];
        if(a.charAt(m-1) == b.charAt(n-1)){
            return dp[m][n]= 1+ LCS(a, b, m-1, n-1);
        }else {
            return dp[m][n]= Math.max(LCS(a, b, m - 1, n),LCS(a, b, m, n - 1));
        }
    }
}
