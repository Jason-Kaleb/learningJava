package oopinjava;

/*
    Program: Going to be
    covering classes.
*/

public class OopInJava 
{
    public static void main(String[] args) 
    {
        Human employee = new Human("John", 22);
        
        System.out.println("Name: " + employee.name);
        System.out.println("Age: "+ employee.age);
        employee.eat();
        employee.toilet();
    }
}