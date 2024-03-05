
package arraylist;

import java.util.ArrayList;

/*
    Program: Going to cover ArrayList
    ArrayList: a resizable array.
    Elements can be added and removed after compilation
    phase.
    Stores reference data types
*/


public class ArrayLists 
{
    public static void main(String[] args) 
    {
        // Declaration of an ArrayList
        
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("BMW");
        cars.add("Golf MK1");
        cars.add("Toyota Supra");
        cars.add("Koenigsegg");
        cars.add("Rolls Royce");
        
        // useful ArrayList methods
        
        cars.set(0, "BMW G80"); // replaces the value with a new place given the index i.e index 0 was BMW and is replaced with BMW G80
        cars.remove(2); // removes element at index 2
        cars.clear(); // clears the ArrayList
        
        // To iterate through an ArrayList is different compared to an array
        // We use the method cars.size() to get size of elements instead of length
        // We use the method cars.get(index) to print items
        
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println((i+1) + ". " + cars.get(i));
        }
    }
    
}
