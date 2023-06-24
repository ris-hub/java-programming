package Bit_Manipulation;

import java.util.Scanner;

public class bit_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 31;
        int mask = 1 >>> n;
        System.out.println(mask);
    }
}
