package Recursion;

public class number_multiplication {
    public static void main(String args[])
    {
        int temp =mul(3,4);
        System.out.println(temp);
    }
    static int mul(int a ,int b)
    {
        if(a==0 || b==0)
            return 0;
        else
            return a + mul( a ,b-1);
    }
}
