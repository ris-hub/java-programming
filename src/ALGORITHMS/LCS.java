package ALGORITHMS;

import java.util.Scanner;

public class LCS {
        static String s ="";

        /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
        int lcs( char[] X, char[] Y, int m, int n )
        {
            if (m == 0 || n == 0)
                return 0;
            if (X[m-1] == Y[n-1]) {
                s = X[m-1]+s;
                return 1 + lcs(X, Y, m - 1, n - 1);
            }
            else
                return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
        }

        /* Utility function to get max of 2 integers */
        int max(int a, int b)
        {
            return (a > b)? a : b;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            LCS lcs = new LCS();
            System.out.println("Enter first String");
            String s1 = sc.next();
            System.out.println("Enter second String");
            String s2 = sc.next();

            char[] X=s1.toCharArray();
            char[] Y=s2.toCharArray();
            int m = X.length;
            int n = Y.length;
            int l=lcs.lcs( X, Y, m, n );
            System.out.println("Length of LCS is" + " " +l);
            String str="";
            System.out.println(s);
            str=s.substring(s.length()-l,s.length());
            System.out.println("String :"+str);
        }

    }

