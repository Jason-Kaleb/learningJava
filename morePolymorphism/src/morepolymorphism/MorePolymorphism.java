package morepolymorphism;

import java.util.Scanner;

/*
    dynamic polymorphism: ability of 
    an ability of an object to take
    many forms/shapes after compilation
*/

public class MorePolymorphism
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        Animal animal;
        
        System.out.println("What animal do you want?");
        System.out.print("(1 = Dog) or (2 = Cat): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1)
        {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2)
        {
            animal = new Cat();
            animal.speak();
        }
        else
        {
            animal = new Animal();
            
            System.out.println("Invalid Choice!");
            animal.speak();
        }
        
    }
    
}
