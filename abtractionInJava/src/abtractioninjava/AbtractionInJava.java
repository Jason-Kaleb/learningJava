package abtractioninjava;

/**
 *  abstract: classes that cannot
 *  be instantiated but they can have
 *  a sub class.
 *  Abstract methods are declared without
 *  implementation
 */

public class AbtractionInJava 
{
    public static void main(String[] args) 
    {
        //Vehicle car = new Vehicle(); --> Cannot instantiate Vehicle because it is an abstract class now.
        
        // Below is a subclass or child class of vehicle which can be instantiated
        Car bmw = new Car();
        
        bmw.go();
        bmw.stop();
    }
}
