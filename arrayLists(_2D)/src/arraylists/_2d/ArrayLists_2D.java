package arraylists._2d;

import java.util.ArrayList;

/*
    Program: learing and discovering
    2d arrayLists in java
*/

public class ArrayLists_2D 
{
    public static void main(String[] args)
    {
        // Declaring a 2D ArrayList below
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        
        // Declaring an ArrayList below for the 2d arraylist
        ArrayList<String> luxeryList = new ArrayList();
        
        luxeryList.add("Coke - Coca Cola");
        luxeryList.add("Chocolate Cake");
        luxeryList.add("Dorito's");
        luxeryList.add("Tax");
        luxeryList.add("Cranberry Juice");
        
        // Declaring a 2D ArrayList below for the 2d arraylist
        ArrayList<String> produceList = new ArrayList();
        
        produceList.add("Chillies");
        produceList.add("Onions");
        produceList.add("Green Pepper");
        produceList.add("Tomato");
        produceList.add("Banana");
        
        groceryList.add(luxeryList);
        groceryList.add(produceList);
        
        // To display the whole groceryList ArrayList than display 1 item from the grocery list
        System.out.println(luxeryList);
        System.out.println(luxeryList.get(0));
        
        System.out.println();
        
        System.out.println(produceList);
        System.out.println(produceList.get(0));
        
        System.out.println();
        
        // Below we displaying the content of the 2d Array list
        System.out.println(groceryList);
        System.out.println(groceryList.get(1));
        // To get the first element of list one or two but we gonna get first element of list 1
        System.out.println(groceryList.get(1).get(2));
    }
}
