package trycatchinjava;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    exception = an event
    that occurs during the execution
    of a program that disrupts the normal
    flow of instructions
*/

public class TryCatchInJava
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        try
        {
            System.out.print("Enter a number to divide: ");
            int x = scanner.nextInt();
            
            System.out.print("Enter a number to divide by: ");
            int y = scanner.nextInt();
            
            int z = x / y;
            
            System.out.println("Answer: " + z);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You cannot divide by 0!");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter a number only and not any other characters/strings");
        }
        finally
        {
            scanner.close();
        }
    }
}
