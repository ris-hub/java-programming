package Recursion;

import java.util.Scanner;

public class print_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print_number(n);
    }
    static void print_number(int n)
    {
        if(n == 1)
            System.out.println(1);
        else {
            System.out.println(n);
            print_number(n - 1);
        }

    }
}
