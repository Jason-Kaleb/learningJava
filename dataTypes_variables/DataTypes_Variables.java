package datatypes_variables;

public class DataTypes_Variables 
{
    public static void main(String[] args) 
    {
       /*
            There are 8 data types in Java and any other programming lanaguage:
            7 which are primitive and 1 reference.
            Primitive: stores actual value e.g int, floats
            Reference: stores memory address e.g only String
       */
        
        // Declaration and initializing variables of different data types
        
        String name = "John";
        int age = 19;
        double weight = 54.4;
        char nameStartsWith = 'J';
        
        System.out.println("Your name is \"" + name + "\" and you are " + age + " years old.");
        System.out.println("You weigh " + weight + "kgs and your name starts with \"" + nameStartsWith + "\".");
     
    } 
}
