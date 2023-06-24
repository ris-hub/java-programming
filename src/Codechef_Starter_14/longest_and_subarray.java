package Codechef_Starter_14;

import java.util.Scanner;

import java.lang.Math;

public class longest_and_subarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int c=0;
            if(n  == 1)
                System.out.println(1);
           else
            {
                int x=(int) (Math.log(n)/Math.log(2));
                System.out.println(x);
                int y=(int)Math.pow(2,x);
                c=y/2;
                if(c<(n-y+1)){
                    c=(n-y)+1;
                }
                System.out.println(c);
            }
        }
    }
}


