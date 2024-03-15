package moreinheri;

/*
    super = keyword refers to
    superclass (parent) of an
    object very similar to "this"
    keyword
*/

public class MoreInheri 
{
    public static void main(String[] args) 
    {
        Hero superman = new Hero("Superman", 30, "Everything");
        Hero batman = new Hero("Batman", 40, "isRich");
        
        System.out.println("Hero 1: ");
        System.out.println("Hero name: " + superman.name);
        System.out.println("Hero age: " + superman.age);
        System.out.println("Hero Power: " + superman.power);
       
        // using toString to print out name, age and power
        //System.out.println(superman.toString());
        //System.out.println(batman.toString());
       
        System.out.println("\nHero 2: ");
        System.out.println("Hero name: " + batman.name);
        System.out.println("Hero age: " + batman.age);
        System.out.println("Hero Power: " + batman.power);
    }
}
