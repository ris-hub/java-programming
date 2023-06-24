public class Exception_Handling {
    public static void main(String args[])
    {
        try
        {
           /* int a=5;
            int b=0;

            int c=a/b;
            System.out.println(c);*/

            int ar[]=new int[]{2,3,4,5,6};
            System.out.println(ar[6]);


        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage()+" occured...please check your code!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage()+"index should be in the range of 0 to size of array...!");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage()+" check your casting carefully...!");
        }
        finally
        {
            System.out.println("Sorry for the inconvenience...");
        }
        System.out.println("this is an important code...");
        System.out.println("This needs to run!");
    }
}
