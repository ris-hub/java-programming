package AdityaVerma.String.LCS;

import java.util.Scanner;

public class ShortestCommonSubseqrec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        int m=x.length();
        int n=y.length();
        System.out.println(m+n- LCS(x, y, m, n));
    }

    private static int LCS(String a, String b, int m, int n) {
        if(m==0 || n==0)
            return 0;

        if(a.charAt(m-1) == b.charAt(n-1)){
            return 1+ LCS(a, b, m-1, n-1);
        }else {
            return Math.max(LCS(a, b, m - 1, n),LCS(a, b, m, n - 1));
        }
    }
}
