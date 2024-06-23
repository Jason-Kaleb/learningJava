package modifyingarraylist;

import java.util.ArrayList;

public class ModifyingArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> Companies = new ArrayList<>();
        
        Companies.add("Google");
        Companies.add("Apple");
        Companies.add("Amazon");
        Companies.add("Facebook");
        Companies.add("Twitter");
        Companies.add("Oracle");
        
        for (int i = 0; i < Companies.size(); i++)
        {
            System.out.println(i + 1 + ". Company Name: " + Companies.get(i));
        }
        
        Companies.set(2, "Microsoft");
        Companies.removeLast();
        
        if (Companies.contains("Oracle"))
        {
            System.out.println("\nCompany exists in the ArrayList");
        }
        else
        {
            System.out.println("\nCompany does not exist in the ArrayList");
        }
        
        System.out.println();
        
        for (int i = 0; i < Companies.size(); i++)
        {
            System.out.println(i + 1 + ". Company Name: " + Companies.get(i));
        }
    }
}
