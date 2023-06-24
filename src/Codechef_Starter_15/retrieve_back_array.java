package Codechef_Starter_15;

import java.util.Scanner;

public class retrieve_back_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int x = sc.nextInt();
        String y=Integer.toBinaryString(x);
        System.out.println(y);
        int z = Integer.parseInt(y,2);
        System.out.println(z);*/
        int t  = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            int x = sc.nextInt();
            if(N == 1)
                System.out.println(x);
            else
            {
                String y=Integer.toBinaryString(x);
                int a[] = new int[N];
                for(int i=1;i<=N*x*2;i++){

                }
                System.out.println(y);
            }
        }
    }
}
