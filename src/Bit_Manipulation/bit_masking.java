package Bit_Manipulation;

import java.util.Scanner;

public class bit_masking {

    //Find the element that appears once in an array where every other element appears twice
   /* public static void fun1(int a1[])
    {
        int res=0;
        for(int i=0; i<a1.length;i++)
        {
            res= res ^ a1[i];
        }
        System.out.println(res);
    }*/

   // Find the two non-repeating elements in an array of repeating elements/ Unique Numbers occur twice
    /*public static fun2(int a2[])
    {

    }*/
    //recursive xor bit
    public static int xor(int a[],int res1)
    {
        int count =0;
        if(res1 == 0)
            return count;
        else
        {
            for(int i=0;i<a.length;i++)
            {
                res1=res1 ^ (a[i]+1);
            }
            count++;
            if(res1 == 0)
                return count;
            xor(a,res1);
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=res ^ a[i];
        }
        xor(a ,res);
        //fun1(a);

    }
}
