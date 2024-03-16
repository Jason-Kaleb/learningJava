package encapsulationinjava;

public class EncapsulationInJava
{
    public static void main(String[] args)
    {
        Car bmw = new Car("BMW", "M4", 2020);
        
        System.out.println("Car name: " + bmw.getName());
        System.out.println("Car model: " + bmw.getModel());
        System.out.println("Car Year: " + bmw.getYear());
        
        // bmw.name = "Audi"; This is not allowed as the attributes are private and can only be accessed within the Car class
        // so now we have to create setter methods within the Car class in order to set name, year and model
        // Below are examples of setter methods that was created in the Car class
        
        bmw.setName("Mercedes");
        bmw.setModel("C63");
        bmw.setYear(2016);
        
        System.out.println("\nCar name: " + bmw.getName());
        System.out.println("Car model: " + bmw.getModel());
        System.out.println("Car Year: " + bmw.getYear());
    }
}
