package com.codechef;

/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    int c1 = 0,c2=0;
    public void input() {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while (t-- > 0) {
            int c1 = 0, c2 = 0;
            for (int i = 0; i < 3; i++) {
                int n = s.nextInt();
                c1 += n;
            }
            for (int i = 0; i < 3; i++) {
                int n = s.nextInt();
                c2 += n;
            }
            display();
        }
    }
    public void display()
    {
        if(c1 > c2){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
    public static void main (String[] args)throws java.lang.Exception
    {
        Codechef ob=new Codechef();
        ob.input();

        // your code goes here
    }
}

