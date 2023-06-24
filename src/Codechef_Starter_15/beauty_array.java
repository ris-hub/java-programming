package Codechef_Starter_15;

import java.util.Arrays;
import java.util.Scanner;

public class beauty_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            int s1=0,s2=0,min=0,d1=0,d2=0;
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int l=1;
            int r=n-1;
            if(n == 2)
                System.out.println(0);
            else if(n == 3)
            {
                int temp=Math.min(a[2]-a[1],a[2]-a[0]);
                System.out.println(temp);
            }
            else if(n>3)
            {
                for(int i=0;i<n-1;i++)
                {
                    s1=s1+Math.abs(a[i]-(a[(n-1)/2]));
                }
                for(int i=1;i<n;i++)
                {
                    s2=s2+Math.abs(a[i]-(a[1 + ((n-1)/2)]));
                }
                min = Math.min(s1,s2);
                while(l < r)
                {
                    d2=a[n - 1] - a[1];
                    d1=a[r] - a[0];
                    min = Math.min(min,Math.abs(d1 - d2));
                    if(d1 < d2)
                        l++;
                    else
                        r--;
                }
                System.out.println(min);
            }
        }
    }
}
