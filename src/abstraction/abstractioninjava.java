package abstraction;

public class abstractioninjava
{
    public static void main(String []args)
    {
        audi a1=new audi();
        a1.start();
    }
}

class audi extends Car {
    void start()
    {
        System.out.println("bmw is starting...");
    }
}
class bmw extends Car{
    void start()
    {
        System.out.println("audi is starting...");
    }
}
abstract class Car
{
    int price;
    abstract void start();
    }
