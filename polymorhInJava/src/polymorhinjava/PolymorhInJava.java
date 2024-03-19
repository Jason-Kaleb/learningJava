package polymorhinjava;

/*
    polymorphism = greek word
    for poly-"many", morph-"form"
    The ability of an object to identify
    as more than one type
*/

public class PolymorhInJava
{
    public static void main(String[] args)
    {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        
        Vehicle[] racers = {car, bicycle, boat};
        
        for (Vehicle x : racers)
        {
            x.go();
        }
    }
}
