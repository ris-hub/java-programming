package com.inheritance;
//when we create child class object parent class is created first

public class B extends A{
    private int y;
    public B()
    {
        y=-1;
        System.out.println("A class 0-arg constructor called");
    }
    public B(int y)
    {
       // super();
        this.y=y;
        System.out.println("A class 1-arg constructor called");
    }
    public void  show()
    {
        System.out.println("value of y="+y);
    }
}
