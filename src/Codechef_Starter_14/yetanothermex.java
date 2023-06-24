package Codechef_Starter_14;

import java.util.ArrayList;
import java.util.Scanner;

public class yetanothermex {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n= sc.nextInt();
            int k=sc.nextInt();
            int arr[] =new int[n];
            for(int i= 0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer> t1 = new ArrayList<Integer>();
            for (int i = 0; i < (1<<n); i++)
            {
               for (int j = 0; j < n; j++)
                    if ((i & (1 << j)) > 0)

                       t1.add(arr[j]);

            }
            System.out.println(t1);
        }
    }
}
