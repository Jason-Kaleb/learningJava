package abtractioninjava;

public class Car extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("The car is being driven by the driver");
    }
    
    @Override
    void stop()
    {
        System.out.println("The car has been stopped by the driver.");
    }
}
