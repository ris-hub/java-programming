package com.pattern;

import java.util.Scanner;

public class reverse_triangle {

    public  void pattern(int n) {
        int i, j, k ,l,m;
        m=n;
        for (i = 0; i < n; i++)
        {
            for (k = 0; k < i; k++)
            {
                System.out.print(" ");
            }
            for (j = n; j >i; j--)
            {
                System.out.print("*");
            }
            for(l=m-1;l>0;l--)
            {
                System.out.print("*");
            }
            m--;
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        reverse_triangle ob = new reverse_triangle();
        ob.pattern(n);
    }

}
/*    OUTPUT:
    Enter a number
        5
        *********
        *******
        *****
        ***
        *
*/
