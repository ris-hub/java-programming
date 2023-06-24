package Codechef_Starter_15;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=2,sum=0;
            if(a < 0 )
                System.out.println(a);
            else if(b < 0)
                System.out.println(b);
            else if(a >0 && b>0) {
                while (n > 1) {
                    if(n  % x ==0)
                    {
                        n=n/x;
                        if(x % 2==0)
                            sum+=a;
                        else
                            sum+=b;
                    }
                    else
                        x++;

                }
                System.out.println(sum);
            }
        }
    }
}
