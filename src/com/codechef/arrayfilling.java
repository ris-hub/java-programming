package com.codechef;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class arrayfilling
{

    public void input()
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0)
        {
            int n = s.nextInt();
            int m = s.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++)
            {
                arr[j] = 0;
            }
            while (m-- > 0)
            {
                int x = s.nextInt();
                int y = s.nextInt();

                for (int j = 1; j <= n; j++)
                {
                    if (arr[j] < x)
                    {
                        if (j % y != 0)
                        {
                            arr[j] = x;
                        }

                    }
                    else if (arr[j] < x)
                    {
                        if (j % y != 0)
                        {
                            arr[j] = x;
                        }
                    }
                    else
                        {
                        arr[j] = 0;
                    }


                }

            }
            for (int j = 1; j <= n; j++)
            {
                sum=sum+arr[j];
            }
            System.out.println(sum);
        }
    }


    public static void main (String[] args)throws java.lang.Exception
    {
        arrayfilling ob=new arrayfilling();
        ob.input();

        // your code goes here
    }

}
