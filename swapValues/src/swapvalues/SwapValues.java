package swapvalues;

import java.util.Scanner;

/*
    In this program we going
    to swap two values as well
    as calculate the hypotenuse
    of a triangle
*/

public class SwapValues 
{
    public static void main(String[] args) 
    {
//        int x, y, temp;
//        
          Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Enter your first value: ");
//        x = scanner.nextInt();
//        
//        scanner.nextLine();
//        System.out.println("X = " + x);
//        
//        System.out.print("Enter your second value: ");
//        y = scanner.nextInt();
//        
//        scanner.nextLine();
//        System.out.println("Y = " + y);
//        
//        /*
//            Below we use a temp variable to store the value of x
//            in order to swap the values of x and y
//        */
//        
//        temp = x;
//        x = y;
//        y = temp;
//        
//        System.out.println("X is now: " + x);
//        System.out.println("Y is now: " + y);
//        System.out.println();
        
        double sideA, sideB, hypotenuse, hypotenuseRounded;
        
        System.out.println("-----Calculate Hypotenuse of a triangle-----\n");
        
        System.out.print("Enter sideA: ");
        sideA = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.print("Enter sideB: ");
        sideB = scanner.nextDouble();
        
        hypotenuse = Math.sqrt((sideA*sideA) + (sideB*sideB));
        hypotenuseRounded = (double) Math.round(hypotenuse * 100) / 100;
        
        System.out.println("\nHypotenuse accurate: " +  hypotenuse);
        System.out.println("Hypotenuse RoundedOff = " + hypotenuseRounded);
        
        scanner.close();
    }
    
}
