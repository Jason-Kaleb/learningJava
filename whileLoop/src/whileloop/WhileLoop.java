package whileloop;

import java.util.Scanner;

/*
    Creating a simple calculator
    again but with while loop
    and some built in java methods
*/

public class WhileLoop
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int calculatedValue = 0;
        String quit = "";
        
        /*
            Instead of using the condition:
            !(quit.equals("q") || quit.equals("Q")) in the while loop
            it will be replaced with !(quit.equalsIgnoreCase("q");
            which is more user friendly and simple
        */
        
        while (!(quit.equalsIgnoreCase("q")))
        {
            System.out.println("-------------Simple Calculator-------------");
            System.out.println();

            System.out.print("Enter your first number: ");
            int firstNumber = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter your second number: ");
            int secondNumber = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Choose any arithmetic operator(+, -, /, *): ");
            String operator = scanner.nextLine();
            
            switch (operator)
            {
                case "+" -> calculatedValue = firstNumber + secondNumber;
                case "-" -> calculatedValue = firstNumber - secondNumber;
                case "*" -> calculatedValue = firstNumber * secondNumber;
                case "/" -> calculatedValue = firstNumber / secondNumber;
                default -> System.out.println("Invalid character!!!");
            }
            
            System.out.print("Calculated value: (" + firstNumber + operator + secondNumber + ") = ");
            System.out.println(calculatedValue);
            
            System.out.print("Press q/Q to quit or any other letter to continue: ");
            quit = scanner.nextLine();
        }
        
    }   
}
