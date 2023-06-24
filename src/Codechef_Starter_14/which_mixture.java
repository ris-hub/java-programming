package Codechef_Starter_14;

import java.util.Scanner;

public class which_mixture {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();
        while(t-->0)
        {
            int a= sc.nextInt();
            int b=sc.nextInt();
            if(a >0 && b>0)
                System.out.println("Solution");
            else if(a ==0 && b>0)
                System.out.println("Solid");
            else if(a>0 && b==0)
                System.out.println("Liquid");
        }
    }
}
