package com.pattern;

import java.util.Scanner;

public class leftdown_pattern
{

    public  void pattern(int n) {
        int i, j;
        for (i = 0; i < n; i++)
        {
            for (j = n; j >i; j--)
            {
                System.out.print("* ");
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
        leftdown_pattern ob = new leftdown_pattern();
        ob.pattern(n);
    }
}
   /* OUTPUT:
            Enter a number
            5
            * * * * *
            * * * *
            * * *
            * *
            *          */

