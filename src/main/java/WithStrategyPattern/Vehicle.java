package WithStrategyPattern;

public class Vehicle {

    DriveStrategy obj;

    // PASS THE SPECIFIC IMPLEMENTATION IN THE CONSTRUCTOR
    // CONSTRUCTOR INJECTION
    Vehicle(DriveStrategy ob){
        this.obj = ob;
    }

    public void drive(){
        obj.drive();
    }
}
