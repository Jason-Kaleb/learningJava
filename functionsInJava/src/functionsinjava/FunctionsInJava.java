package functionsinjava;

/*
    Program: Covering functions/methods 
    in Java
*/

public class FunctionsInJava 
{
    public static void main(String[] args)
    {
        hello();
        
        System.out.println();
        
        int sum = add(99, 99);
        
        System.out.println(sum);
    }
    
    // Below we create a method/function with no return type.
    static void hello()
    {
        System.out.println("This is a function.");
        System.out.print("When you see this message-");
        System.out.println("It means this function has been called or invoked.");
    }
    
    // Below we create a method/function with an int return type, with parameters.
    static int add(int x, int y)
    {
        return (x + y);
    }
}
