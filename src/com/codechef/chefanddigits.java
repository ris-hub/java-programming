package com.codechef;

import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class chefanddigits {


        public void input()
        {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            while (m-- > 0)
            {
                int n = sc.nextInt();
                int d = 0, f = 1, s = 1, c = 0, t = 0, out ;
                for (int i = 1; i < n; i++)
                {
                    while (i != 0)
                    {
                        d = i % 10;
                        s = s * d;
                        c++;
                        i = i / 10;
                    }
                    f = factorial(c);
                    if (s < f)
                    {
                        t++;
                    }
                    f = s = 1;
                    c = 0;

                }
                out = n - t;
                System.out.println(out);
            }
        }
    public int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }


    public static void main (String[] args)throws java.lang.Exception
        {
            chefanddigits ob=new chefanddigits();
            ob.input();

            // your code goes here
        }


}
