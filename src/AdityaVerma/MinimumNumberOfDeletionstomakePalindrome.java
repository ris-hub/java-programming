package AdityaVerma;

import java.util.Scanner;

public class MinimumNumberOfDeletionstomakePalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        int m=a.length();
        String b="";
        for(int i=m-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        int n=b.length();
        System.out.println(a.length() - LCS(a, b, m, n));
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
