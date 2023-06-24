package Codechef_Starter_14;

import java.util.Scanner;

public class digit_removal {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int d= sc.nextInt();
            int t1,x,c=0,temp=0;
            t1=n;
            while(t1>0)
            {
                x=t1%10;
                t1=t1/10;
                c++;
                if(x==d)
                {
                    t1= t1 * (int)Math.pow(10,c) + (x+1)* (int)Math.pow(10,c-1);
                    temp= t1-n;
                    c=0;
                }

            }
            System.out.println(temp);
        }
    }
}
