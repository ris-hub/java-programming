package Codechef_Starter_15;

import java.util.Scanner;

public class equal_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x % 2==0)
            {
                if(x == 0 && y%2!=0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
