package Codechef_Starter_15;

import java.util.Scanner;

public class which_fuel_is_cheaper
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            int ans1= x + (k * a);
            int ans2= y + (k * b);
            if(ans1 > ans2)
                System.out.println("PETROL");
            else if(ans2 > ans1)
                System.out.println("DIESEL");
            else
                System.out.println("SAME PRICE");
        }
    }


}
