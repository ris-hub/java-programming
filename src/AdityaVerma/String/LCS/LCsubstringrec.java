package AdityaVerma.String.LCS;

public class LCsubstringrec {
    public static void main(String[] args) {
        System.out.println(LCS("rishabh", "risbabh", 7, 7));
    }

    private static int LCS(String a, String b, int m, int n) {
        if(m==0 || n==0)
            return 0;
        int count=0;
        if(a.charAt(m-1) == b.charAt(n-1)){
            return 1+ LCS(a, b, m-1, n-1);
        }else {
            return 0;
        }
    }
}
