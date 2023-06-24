package OOPs;

public class CarDetails extends Car{
    protected String model;
    CarDetails(CarDetails ob){
        model = ob.model;
    }
    CarDetails(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
    }
    CarDetails(){
        model = "Corolla LE";
        make =" ";
        year =0;
    }
    CarDetails(String model){
        this.model = model;
        make =" ";
        year =0;
    }
}
