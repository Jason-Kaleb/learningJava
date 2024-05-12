package arr_arrlistprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arr_arrListPrac
{
    public static void main(String[] args)
    {
        // ArrayList activity 1: Create a list of unique elements taken from user. Sort and print these elements
        // E.g Enter 10 integers: 1 8 9 2 6 6 1 3 5 5, Output [1, 2, 3, 5, 6, 8, 9]
        
//        ArrayList<Integer> integers = new ArrayList<>();
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Enter 10 integers: ");
//        
//        for (int i = 0; i < 10; i++)
//        {
//            int temp = scanner.nextInt();
//            
//            if (!integers.contains(temp))
//                integers.add(temp);
//        }
//        
//        Collections.sort(integers);
//        System.out.println(integers);
        
//        ArrayList<String> names = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        Boolean exitCondition = true;
//        
//        while (exitCondition)
//        {
//            displayMenu();
//            
//            int choice = scanner.nextInt();
//            
//            switch (choice)
//            {
//                case 1 ->
//                {
//                    System.out.print("Enter a name: ");
//                    names.add(scanner.next());
//                    System.out.println("Added");
//                }
//                case 2 ->
//                {
//                    System.out.println("Enter name to remove: ");
//                    
//                    String elementToRemove = scanner.next();
//                    
//                    if (names.contains(elementToRemove))
//                    {
//                        names.remove(elementToRemove);
//                        System.out.println("Removed");
//                    }
//                    else
//                    {
//                        System.out.println("Name not found");
//                    }
//                }
//                case 3 ->
//                {
//                    System.out.println("Your name list: " + names);
//                }
//                case 4 ->
//                {
//                    System.out.println("Bye.");
//                    exitCondition = false;
//                }
//                default ->
//                {
//                    System.out.println("Invalid Option");
//                }
//        
//            }
//        }
        
        // Arrays Activity 1: Write a program that fills an array with n integers entered by user
        
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("How many elements? (Max is 20): ");
//        int n = scanner.nextInt();
//        
//        while (n > 20 || n <= 0)
//        {
//            System.out.print("Invalid number, try again: ");
//            n = scanner.nextInt();
//        }
//        
//        int[] numbers = new int[n];
//        
//        fillArrayOfIntegers(numbers);
//        printArrayOfIntegers(numbers);
        
       // Arrays Activity 2: Write a program that displays the number of occurences of an element in the array
        
//        int[] numbers = {1, 2, 3, 4, 5, 3, 4, 3, 3, 3};
//        int searchElement = 3;
//        
//        System.out.println(searchElement + " occurred " + getNumberOcc(numbers, searchElement) + " times");
        
        // 2D Arrays: Print sum of rows and columns
        
        int[][] integers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        for (int i = 0; i < integers.length; i++)
        {
            int rowSum = 0;
            for (int j = 0; j < integers[0].length; j++)
            {
                rowSum += integers[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
        
        for (int i = 0; i < integers[0].length; i++)
        {
            int colSum = 0;
            for (int j = 0; j < integers.length; j++)
            {
                
                colSum += integers[j][i];
            }
            System.out.println("Sum of col " + (i + 1) + ": " + colSum);
        }
    }
    
    private static void displayMenu()
    {
        System.out.println();
        System.out.println("1. Add Element");
        System.out.println("2. Remove Elements");
        System.out.println("3. Display Elements");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your choice: ");
    }

    private static void fillArrayOfIntegers(int[] numbers)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numbers: ");
        
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = scanner.nextInt();
        }
    }

    private static void printArrayOfIntegers(int[] numbers)
    {
        System.out.print("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }
    
    public static int getNumberOcc(int[] numbers, int searchElement)
    {
        int occ = 0;
        
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == searchElement)
                occ++;
        
        return occ;
    }
}
