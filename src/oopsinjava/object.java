package oopsinjava;

import encapsulation.EncapsulationIntro;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class object {
    public static void main(String [] args)
    {
        Person p1=new Person();
        p1.name="Rishabh";
        p1.age=21;

       /* Person p2=new Person();
        p2.name="potter";
        p2.age=22;*/
        //Person p2=new Person(21,"Rishabh Prasad");
        System.out.println(p1.name+" "+p1.age);
       // System.out.println(p2.name+" "+p2.age);
        /*p1.walk();
        p1.eat();
        p2.walk();
        p2.eat();
        p1.walk(5);*/
        //System.out.println(Person.count);
        //Inheritance
       /* developer d1=new developer(21,"Rishabh prasad");
        d1.eat();*/
       // EncapsulationIntro obj=new EncapsulationIntro();
       // obj.dowork();
    }
}
//Inheritance
/*class developer extends Person
{
    public developer(int age, String name)
    {
        super(age, name);//caller parent constructor
    }
    void eat()
    {
        System.out.println("Developer "+name+" is eating...");
    }
}*/
class Person
{
    String name;
    int age;
    //static
    static int count;
    //constructor
    public Person()
    {
        count++;
        System.out.println("creating an object...");
    }
    //constructor overloading
    /*public Person(int newage,String newname)
    {
        this();
        name=newname;
        age=newage;
    }*/
    /*public Person(int age,String name)
    {
        //this();
        this.name=name;
        this.age=age;
    }*/
    //behaviour
    /*void walk()
    {
        System.out.println(name+" is walking...");
    }
    void eat()
    {
        System.out.println(name+" is eating...");
    }
    void walk(int steps)
    {
        System.out.println(name+" walked "+steps+" steps.");
    }*/
}
