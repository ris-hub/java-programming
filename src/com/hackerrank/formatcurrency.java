package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class formatcurrency {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Double payment=sc.nextDouble();
        sc.close();
        NumberFormat objus=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat objin=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat objch=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat objfr=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us=objus.format(payment);
        String in=objin.format(payment);
        String ch=objch.format(payment) ;
        String fr=objfr.format(payment);

        System.out.println("US: " +us );
        System.out.println("India: " + in );
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}


