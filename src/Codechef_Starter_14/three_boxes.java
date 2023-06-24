
package Codechef_Starter_14;

import java.util.Scanner;

public class three_boxes {
    public static void main (String args[]) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextByte();
        while(t-- >0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c =sc.nextInt();
            int d=sc.nextInt();
            int sum=0,rem=0,f=0,t1=0,a1=0;
            sum = (a + b + c);
            t1 = sum;
            try {
                rem = sum / d;
                f = t1 % d;
            }

            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            if (f > 0)
                a1++;
            if(b == c)
                a1++;
            System.out.println(rem + a1);
        }

        }
    }


