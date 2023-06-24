package AdityaVerma.String.LCS;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintLCS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];
        System.out.println(LCS(a, b, m, n, dp));
    }

    private static String LCS(String a, String b, int m, int n, int [][]dp) {
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)
                    dp[i][j]=0;
            }
        }
        for(int i=1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        StringBuilder sb= new StringBuilder();
        int i=m, j=n;
        while(i>0 && j>0){
            if(a.charAt(i-1) == b.charAt(j-1)){
                sb.append(a.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i][j-1] > dp[i-1][j])
                    j--;
                else
                    i--;
            }
        }
        return sb.reverse().toString();
    }

}
