package oopinjava;

public class Human 
{

    String name;
    int age;

    // Constructor
    Human(String hName, int hAge) 
    {
        name = hName;
        age = hAge;
    }

    // methods/functions
    void toilet() 
    {
        System.out.println(name + " is now using the toilet");
    }

    void eat() 
    {
        System.out.println(name + " is eating");
    }
}