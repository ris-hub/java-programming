
import java.util.*;

class ArrayDemo
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);// Here System.in represent to KeyBoard

        //int x[]= null;

        //x= new int[5];

        int x[]= new int[5];

        //	int  x[] = {5,6,8,7,4};

        //String city[] =  {"Jaipur","Kota","Agra"};

        System.out.println ("**********************************************");
        for (int i = 0; i<x.length; i++)
        {
            System.out.println ("Enter an Element in an Array");

            x[i] = sc.nextInt();

        }
        System.out.println ("**********************************************");

        System.out.println ("Unsing Normal For loop");

        for (int i = 0; i<x.length; i++)
        {
            System.out.println ("x ["+i+"] = "+ x[i]);
        }
        System.out.println ("**********************************************");
        System.out.println ("Unsing For-each loop");


        for(int i:x)
        {
            System.out.println (i);
        }
    }
}