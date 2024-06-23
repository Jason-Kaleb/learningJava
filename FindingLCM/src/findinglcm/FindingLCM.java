package findinglcm;

import java.util.Scanner;

public class FindingLCM
{
    public static void main(String[] args)
    {
        System.out.println("--Finding the LCM--");
        
        Scanner scanner = new Scanner(System.in);
        
        int a, b, result;
        
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        
        result = LCM(a, b);
        
        System.out.println("\nThank you for your input!");
        System.out.println("\nThe LCM of " + a + " & " +  b + " is: " + result);
    }
    
    static int GCD(int a, int b) // --> GCM - Greatest common divisor
    {
        if (b == 0)
        {
            return a;
        }
        
        if (a < b)
        {
             return GCD(b, a);
        }
        else
        {
            return GCD(b, a % b);
        }
    }
    
    static int LCM(int a, int b) // --> LCM - Lowest common multiple
    {
        return ((a * b) / GCD(a, b));
    }
}
