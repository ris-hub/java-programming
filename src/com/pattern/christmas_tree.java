package com.pattern;

import java.util.Scanner;

public class christmas_tree {
    public  void pattern(int n) {
        int i, j, k ,l,h;
        for (i = 0; i < n; i++)
        {
            for(h=0;h<n*4;h++)
            {
                System.out.print(" ");
            }
            for (j = n-1; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 0; k < i+1; k++)
            {
                System.out.print("*");
            }
            for (l= 0; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++)
        {
            for(h=1;h<n*4;h++)
            {
                System.out.print(" ");
            }
            for (j = n-1; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 0; k < i+3; k++)
            {
                System.out.print("*");
            }
            for (l= 0; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++)
        {
            for(h=2;h<n*4;h++)
            {
                System.out.print(" ");
            }
            for (j = n-1; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 0; k < i+5; k++)
            {
                System.out.print("*");
            }
            for (l= 0; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++)
        {
            for(h=3;h<n*4;h++)
            {
                System.out.print(" ");
            }
            for (j = n-1; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 0; k < i+7; k++)
            {
                System.out.print("*");
            }
            for (l= 0; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < 3; i++)
        {
            for(h=0;h<n*4;h++)
            {
                System.out.print(" ");
            }
            for (j = 0; j <n-2; j++)
            {
                System.out.print(" ");
            }
            for (k = 0; k < 3; k++)
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
        christmas_tree  ob = new christmas_tree();
        ob.pattern(n);
    }

}
