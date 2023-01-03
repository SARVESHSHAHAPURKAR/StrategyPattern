package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    // THIS METHOD DEFINITION IS REPEATED MULTIPLE TIMES IN OTHER CHILD CLASSES
    @Override
    public void drive(){
        System.out.println("Special Drive Capability");
    }
}
