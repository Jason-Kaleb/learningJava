package forloop;

import java.util.Scanner;

/*
    In this learning file
    i am going to do for loops
    might nested
    Use next() when you want to read individual words or tokens separated by whitespace.
    Use nextLine() when you want to read the entire line of text, including spaces and special characters.

*/

public class ForLoop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
  
        System.out.print("Enter the symbol you want to use: ");
        String symbol = scanner.next();
        
        for (int i = 1; i <= rows; i++)
        {
            System.out.println();
            
            for (int j = 1; j <= columns; j++)
            {
                System.out.print(symbol);
            }
        }
        System.out.println();
    }
    
}
