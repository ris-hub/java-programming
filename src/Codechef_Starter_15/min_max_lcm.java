package Codechef_Starter_15;

import java.util.Scanner;

public class min_max_lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long x=sc.nextLong();
            long k=sc.nextLong();
            long n = 0;
            n=(k*x) * ((k*x)-1);
            System.out.println(2*x +" "+n );
        }
    }
}
