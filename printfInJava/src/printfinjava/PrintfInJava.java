package printfinjava;

/*
    printf(): an optional method to control, format and
    display text to the console window.
    Two arguments: format + string + (object/variable/value)
    % [flags] [precision] [width] [conversion-character]
*/

public class PrintfInJava 
{
    public static void main(String[] args) 
    {
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Doe";
        int myInt = 22;
        double myDouble = 1.12;
        
        // [conversion-character]
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);
        
        // [width] -> minimum number of characters to be written as output
        System.out.printf("Hello%10s\n", myString);
        
        // [[precision] -> sets number of digits of precision when outputting float-point values
        System.out.printf("%.2f\n", myDouble);
    }
    
}
