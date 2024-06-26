package palindromechecker;

import java.util.Scanner;

public class PalindromeChecker 
{
    public static void main(String[] args)
    {
        System.out.println("---Palindrome Checker---");
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Please enter a string: ");
        String message = scanner.nextLine();
        
        System.out.println("Thank you for your input!");
        
        boolean isPalindrome = isPalindromeForString(message);
        
        if (isPalindrome)
        {
            System.out.println("The string(" + message + ") you entered is a Palindrome");
        }
        else
        {
            System.out.println("The string(" + message + ") you entered is not a Palindrome");
        }
    }
    
    static boolean isPalindromeForString(String message)
    {
        String reversedString = "";
        
        for(int i = message.length() - 1; i >= 0; i--)
        {
            reversedString += message.charAt(i);
        }
     
        return (message.equals(reversedString));
    }
    
    static boolean isPalindromeForInt(int number)
    {
        if (number < 0)
        {
            return false;
        }
        
         int originalNumber = number;
        int reversedNumber = 0;
        
        while (number > 0)
        {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
