package OOPs;

public class Car {
    protected String make;
    protected int year;

    public Car(Car ob){
        make = ob.make;
        year = ob.year;
    }
    public Car(String make, int year){
        this.make = make;
        this.year = year;
    }
    public Car(){
        make ="";
        year =0;
    }
}
