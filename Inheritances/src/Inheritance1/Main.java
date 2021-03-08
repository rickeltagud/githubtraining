package Inheritance1;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        MiniVan m = new MiniVan();

        c.Engine ="VT200engine";
        c.brakes = "disk";
        c.ignition ="distributed-based";
        c.tires = 4;

        m.Engine ="VT300engine";
        m.brakes ="ABS";
        m.tires =6;

        //void method Calling Car and MiniVan
        c.Parts();
        m.Parts();

        //void method Calling Minivan
        m.SlidingDoor();

    }//main
}
