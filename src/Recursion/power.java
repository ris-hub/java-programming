package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(power(a ,b));
    }
    static int power(int a, int b)
    {
        if(b == 0)
            return 1;
        if(b % 2 ==0)
            return power(a*a,b/2);
        return a * power(a,b-1);

    }
}
