package com.pattern;

import java.util.Scanner;

public class w_pattern {
    public  void pattern(int n) {
        int i, j ,k,l,m,e;
        for (i = 0; i < n; i++)
        {
            for (int a = 0; a <i; a++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
           for(j=0;j<(n+2-(i*2));j++)
           {
               System.out.print(" ");
           }
           // System.out.print("*");
            /*for (k = 0; k < i + 1; k++) {
                System.out.print(" ");
            }
            for (l = 0; l < i; l++) {
                System.out.print(" ");
            }*/
            if(n-i>1)
            {
                System.out.println("*");
            }
            System.out.println();
         }
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        w_pattern ob = new w_pattern();
        ob.pattern(n);
    }
}
