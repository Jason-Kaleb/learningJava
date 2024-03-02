package if_else;

import java.util.Scanner;

/*
    Creating a simple calculator
    using control flow statements
    and some built in java methods
*/

public class If_else 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int calculatedValue = 0;
        
        System.out.println("-------------Simple Calculator-------------");
        System.out.println();
        
        System.out.println("Enter your first number: ");
        int firstNumber = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Enter your second number: ");
        int secondNumber = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Choose any arithmetic operator(+, -, /, *): ");
        char operator = scanner.nextLine().charAt(0);
        
        if (operator == '+')
        {
            calculatedValue = firstNumber + secondNumber;
        }
        else if (operator == '-')
        {
            calculatedValue = firstNumber - secondNumber;
        }
        else if (operator == '*')
        {
            calculatedValue = firstNumber * secondNumber;
        }
        else if (operator == '/')
        {
            calculatedValue = firstNumber / secondNumber;
        }
        else
        {
            System.out.println("Invalid character!!!");
        }
        
        System.out.print("Calculated value: (" + firstNumber + operator + secondNumber + ") = ");
        System.out.println(calculatedValue);
    }
}
