package com.pattern;

import java.util.Scanner;

public class diamond
{

    public  void pattern(int n) {
        int i, j, k, l;
        for (i = 0; i < n; i++) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for (l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++)
        {
            for (j = 0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (k = n; k >i ; k--)
            {
                System.out.print("*");
            }
            for (l = n; l > i+1; l--)
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
        diamond ob = new diamond();
        ob.pattern(n);
    }
}
