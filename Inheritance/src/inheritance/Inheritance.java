package inheritance;

/*
    Program: going to cover
    inheritance. Inheritance = 
    the process where one class acquires
    the attributes and methods of another.
*/

public class Inheritance 
{
    public static void main(String[] args)
    {
        Car bmw = new Car();
        Bicycle bike = new Bicycle();
        
        System.out.println(bmw.speed);
        bmw.go();
        bmw.stop();
        System.out.println("Number of doors: " + bmw.doors);
        System.out.println("Number of wheels: " + bmw.wheels);
        System.out.println();
        
        System.out.println();
        System.out.println(bike.speed);
        bike.go();
        bike.stop();
        System.out.println("Number of pedals: " + bike.pedals);
        System.out.println("Number of wheels: " + bike.wheels);
        System.out.println();
        
    }
}
