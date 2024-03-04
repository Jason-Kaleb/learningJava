package stringmethods;

        /*
            String = reference data type that can store one
            or more characters
            Reference data types have access to useful methods
        */
        

public class StringMethods 
{
    public static void main(String[] args) 
    {
        String name = "      Jason             ";
        
        //boolean result = name.equalsIgnoreCase("jason");
        //int result = name.length();
        //char result = name.charAt(0);
        //boolean result = name.isEmpty();
        //boolean result = name.isBlank();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = (name.replace("o", "a")).trim();
        
        System.out.println("result = " + result);
    }
    
}
