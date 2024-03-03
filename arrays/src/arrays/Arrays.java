package arrays;

import java.util.Scanner;

/*
    Below i am going to 
    use arrays both 1D 
    and 2D arrays with
    user input of course
 */
public class Arrays 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        //Below i am creating an array of size 2 with default values "", ""
        String[] nameAge = new String[2];

        System.out.print("Enter your name here: ");
        String name = scanner.nextLine();
        
        nameAge[0] = name;

        System.out.print("Enter your age here: ");
        String age = scanner.nextLine();
        
        nameAge[1] = age;

        //declaring and initializing a 2d array
        String[][] informationStored = {
                                            {"Name", "Age"},
                                            {nameAge[0], nameAge[1]}
                                        };

        //this is how we use a for loop to loop through an array or a 2d array
        
        for (int i = 0; i < informationStored.length; i++) 
        {
            System.out.println();
            for (int j = 0; j < informationStored[0].length; j++) 
            {
                System.out.print(informationStored[i][j] + " ");
            }
        }
        System.out.println();
    }
}

