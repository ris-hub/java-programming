package dp;

import java.util.Scanner;

public class minstepsto1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        int n = sc.nextInt();
        System.out.println(minsteps(n));
    }

    private static int minsteps(int n) {
        if(n==1)
            return n;
        if(n % 3==0)
            return minsteps(n/3);

        else if(n%2==0)
            return  minsteps(n/2);
        else
            return minsteps(n-1);
    }
}
