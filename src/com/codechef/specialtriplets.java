package com.codechef;

/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class specialtriplets {
    public void input()
    {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int a,b,c=1;
            long d=0;
            while(c<=n) {
                for ( b = c; b <= n; b=b+c) {
                    if (b % c == 0) {
                        for ( a = c; a <= n; a=a+b) {
                            if (a%b==c) {
                                d++;
                            }
                        }
                    }
                }
                c++;
            }
            System.out.println(d);

        }
    }
    public static void main (String[] args)throws java.lang.Exception {
       specialtriplets ob = new specialtriplets();
        ob.input();
    }
}
