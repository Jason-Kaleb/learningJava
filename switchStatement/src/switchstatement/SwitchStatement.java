package switchstatement;

import java.util.Scanner;

/*
    Creating a simple calculator
    using control flow statements
    going to be using switch statements this time
    and some built in java methods
*/

public class SwitchStatement 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int calculatedValue = 0;
        
        System.out.println("-------------Simple Calculator-------------");
        System.out.println();
        
        System.out.print("Enter your first number: ");
        int firstNumber = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Enter your second number: ");
        int secondNumber = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Choose any arithmetic operator(+, -, /, *): ");
        char operator = scanner.nextLine().charAt(0);
        
        // Traditional switch case 
        /*
        switch (operator)
        {
            case '+':
                calculatedValue = firstNumber + secondNumber;
            break;
            case '-':
                calculatedValue = firstNumber - secondNumber;
            break;
            case '*':
                calculatedValue = firstNumber * secondNumber;
            break;
            case '/':
                calculatedValue = firstNumber / secondNumber;
            break;
            default:
                System.out.println("Invalid character!!!");
            break;
        }
        */
        
        // rule switch which was introduced in Java 17 as a preview feature
        
        switch (operator)
        {
            case '+' -> calculatedValue = firstNumber + secondNumber;
            case '-' -> calculatedValue = firstNumber - secondNumber;
            case '/' -> calculatedValue = firstNumber / secondNumber;
            case '*' -> calculatedValue = firstNumber * secondNumber;
            default -> System.out.println("Invalid character!!!");
        }
        
        System.out.print("Calculated value: (" + firstNumber + operator + secondNumber + ") = ");
        System.out.println(calculatedValue);
    }
    
}
