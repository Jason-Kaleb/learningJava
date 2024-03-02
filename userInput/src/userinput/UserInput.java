package userinput;

import java.util.Scanner;

        /*
            In Java, In order to get user input
            we have to import a scanner package
            By placing the following line of code
            at the very top of your source code
            import java.util.Scanner
            After doing that you have to create an
            object using the scanner.
        */

public class UserInput
{
    public static void main(String[] args) 
    {
        // Created our scanner obj below to get user input
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.println("What is your favorite? ");
        String favoriteFood = scanner.nextLine();
        
        System.out.println("Hey " + name + ".You are " + age + " years old.");
        System.out.println("You have won yourself a meal(" + favoriteFood + ").");
        
        
    }
    
}
