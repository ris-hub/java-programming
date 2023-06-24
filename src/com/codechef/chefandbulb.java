package com.codechef;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class chefandbulb {

    public void input() {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int p=s.nextInt();
            int k=s.nextInt();
            int rem=0,f=0,d=0;
            for(int i=0;i<n;i++)
            {
                if(i==n-1)
                {
                    i = 0;
                    f++;
                }
                rem = i % k;
                if (rem == f) {
                    d++;
                    if (i == p) {
                        break;
                    }
                }


            }
            System.out.println(d);
            }
        }


    public static void main (String[] args)throws java.lang.Exception
    {
        chefandbulb ob=new chefandbulb();
        ob.input();

        // your code goes here
    }

}
