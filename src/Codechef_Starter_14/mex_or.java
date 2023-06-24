package Codechef_Starter_14;

import java.util.Scanner;

public class mex_or {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int temp = 1;
            if (n == 0)
                System.out.println(1);
            else if (n == 1 || n == 2)
                System.out.println(2);
            else {
                //int x = (int) (Math.log(n) / Math.log(2));
                while (temp *2 <= n) {
                    temp = temp * 2;
                }
                if ( temp == n)
                    System.out.println(temp);
                else if((temp * 2)-1 == n )
                    System.out.println(temp+1);
                else
                    System.out.println(temp);

            }
        }
    }
}
