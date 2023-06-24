package Kunal_kushwaha;

import java.util.Arrays;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long startTime = System.currentTimeMillis();
        System.out.println(fib(n));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        int []dp = new int[n+1];
        Arrays.fill(dp, -1);
        long StartTime = System.currentTimeMillis();
        System.out.println(fib(n, dp));
        long EndTime = System.currentTimeMillis();
        System.out.println(EndTime - StartTime);

        System.out.println(fiboFormula(n));
    }
    static int fib(int n){
        if(n<2)
            return n;

        return fib(n-1)+ fib(n-2);
    }
    static int fib(int n, int dp[]){
        if(n<2)
            return n;
        if(dp[n]!=-1)
            return dp[n];

        return dp[n]=fib(n-1, dp)+fib(n-2, dp);
    }
    static int fiboFormula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / (Math.sqrt(5)));
    }
}
