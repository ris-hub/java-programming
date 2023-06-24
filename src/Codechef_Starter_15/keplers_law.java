package Codechef_Starter_15;

import java.util.Scanner;

public class keplers_law {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            double t1 = sc.nextDouble();
            double t2 = sc.nextDouble();
            double r1 = sc.nextDouble();
            double r2 = sc.nextDouble();
            double s1 = (t1*t1) / (r1*r1*r1);
            double s2 = (t2*t2) / (r2*r2*r2);


            System.out.println(s1);
            System.out.println(s2);
            if(s1 == s2)
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
}
