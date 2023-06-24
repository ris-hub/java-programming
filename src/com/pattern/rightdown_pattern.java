package com.pattern;
import java.util.Scanner;
public class rightdown_pattern {

    public  void pattern(int n) {
        int i, j ,k;
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

            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        rightdown_pattern ob = new rightdown_pattern();
        ob.pattern(n);
    }
}
 /*   OUTPUT:
    Enter a number
        5
        *****
        ****
        ***
        **
        *     */
