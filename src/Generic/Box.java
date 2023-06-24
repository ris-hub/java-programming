package Generic;

public class Box<T> {

    //Object class is top most parent class of all java class
    T container;

    public Box(T container){
        this.container = container;
    }
    public void performmsomeTask(){
        if(container instanceof String){
            System.out.println("length of"+container+" is "+ ((String)this.container).length());
        } else if (container instanceof Integer) {
            System.out.println("This is integer value "+ container);
        }
    }
    public Object getValue(){
        return this.container;
    }
}
