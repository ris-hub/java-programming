package Codechef_Starter_15;

import java.util.Scanner;

public class dance_moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y > x) {
                if (x % 2 == 1 && y % 2 == 0 || x % 2 == 0 && y % 2 == 1) {
                    System.out.println(Math.abs((((y - 1) - x) / 2) + 2));
                } else if (x % 2 == 1 && y % 2 == 1) {
                    System.out.println(Math.abs(((y - x) / 2) + 2));
                } else {
                    System.out.println(Math.abs((y - x) / 2));
                }

            } else
                System.out.println(Math.abs(y - x));

        }
    }
    }
