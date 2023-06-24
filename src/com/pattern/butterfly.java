package com.pattern;

import java.util.Scanner;

public class butterfly {
    public  void pattern(int n) {
        int i, j, k ,l,m;
        for (i = 0; i < n; i++)
        {
            for (k = 0; k < i+1; k++)
            {
                System.out.print("*");
            }
            for (j = n; j >i; j--)
            {
                System.out.print(" ");
            }
            for (l = n-1; l > i; l--)
            {
                System.out.print(" ");
            }
            for (m = 0; m < i+1; m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++)
        {
            for (j = n; j > i; j--)
            {
                System.out.print("*");
            }
            for (k = 0; k < i+1; k++)
            {
                System.out.print(" ");
            }
            for (l = 0; l < i; l++)
            {
                System.out.print(" ");
            }
            for (m = n; m >i; m--)
            {
                System.out.print("*");
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
        butterfly ob = new butterfly();
        ob.pattern(n);
    }
}
