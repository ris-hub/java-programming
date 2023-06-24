package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Long n = sc.nextLong();
        BigInteger d = new BigInteger("n");
        System.out.println(fact(n));
    }

    static long fact(long n)
    {
        if(n == 0)
            return 1;
        System.out.println(n);
        return n * fact(n-1);
    }
}
