package oopsinjava;

public class Polymorphism {
    public static void main(String[] args) {
        Husky ob = new Husky();
        ob.bark();
        ob.bite();
    }
}

class German extends Polymorphism{
    public void bark(){
        System.out.println("Bhow Bhow");
    }
}

class Husky extends German{
    public void bite(){
        System.out.println("Woof Woof");
    }
}
