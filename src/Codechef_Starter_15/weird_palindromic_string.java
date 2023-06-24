package Codechef_Starter_15;

import java.util.Scanner;

public class weird_palindromic_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int a,c=0;
            for(int i=0;i<n;i++)
            {
                a=sc.nextInt();
                if(a%2 == 0)
                    c++;
            }
            if(c%2 ==0)
                c=c-1;
            System.out.println(c/2);
        }

    }
}
