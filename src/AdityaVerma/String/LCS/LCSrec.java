package AdityaVerma.String.LCS;

public class LCSrec {
    public static void main(String[] args) {
        System.out.println(LCS("nitisn", "nsitin", 6, 6));
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
