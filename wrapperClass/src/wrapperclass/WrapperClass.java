package wrapperclass;

/*
    wrapper class: provides a way to use primitive
    data types as reference data types.
    Reference data types: contains useful methods
*/

public class WrapperClass 
{
    public static void main(String[] args) 
    {
        /*
            primitive    wrapper
            ---------    -------
            boolean      Boolean
            char         Character
            int          Integer
            double       double
        
            autoboxing: the automatic conversion that the Java compiler
            makes between primitive types and their corresponding object wrapper class
            unboxing: Reverse of autoboxing. Automatic conversion of the wrapper class to primitive
        */
        
        Boolean a = true;
        Character b = '&';
        Integer c = 2;
        Double d = 3.14;
        String e = "Joe";
    }
    
}
