package com.inheritance;
//by default A class is child class of object class
public class A {
    private int x;
     public A()
     {
         x=-1;
         System.out.println("A class 0-arg constructor called");
     }
    public A(int x)
    {
        this.x=x;
        System.out.println("A class 1-arg constructor called");
    }
    public void show()
    {
        System.out.println("value of x="+x);
    }
}
