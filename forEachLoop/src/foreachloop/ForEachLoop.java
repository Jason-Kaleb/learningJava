package foreachloop;

import java.util.ArrayList;

/*
    Program: Using for-each loop
    for-each: traversing technique to iterate
    through the elements in an array/collection
*/
public class ForEachLoop 
{
    public static void main(String[] args) 
    {
        /*
            Using for-each to iterate through a 1D array
            String[] vehicles = {"BMW", "MERCEDES", "AUDI", "VW"};
  
        for(String i : vehicles)
        {
            System.out.println(i);
        }
        */
        
        // Using for-each to iterate through an ArrayList
        
        ArrayList<String> vehicles = new ArrayList<String>();
        
        vehicles.add("VW");
        vehicles.add("BMW");
        vehicles.add("Audi");
        vehicles.add("Mercedes");
        
        for (String i : vehicles)
        {
            System.out.println(i);
        }
    }
}
