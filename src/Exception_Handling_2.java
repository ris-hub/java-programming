public class Exception_Handling_2
{

    public static void main()
    {
        fun1();
    }
    static void fun1()
    {
        int a=1;
        int b=3;
        int c=a/b;
        System.out.println(c);
        System.out.println("hey!!!");

        try
        {
            fun2();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage()+" occurred");
        }
    }
    static void fun2() throws ArrayIndexOutOfBoundsException
    {
        boolean isDanger = true;
        if(isDanger)
        {
            throw new ArrayIndexOutOfBoundsException("danger was coming...");
        }
    }
}
