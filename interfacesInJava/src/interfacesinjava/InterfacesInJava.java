package interfacesinjava;

/*
    Interface = a template that can be
    applied to a class
    Similar to inheritance but
    specifies what a class has/must do
    Classes can apply more than one interface,
    Inheritance is limted to 1 super
*/

public class InterfacesInJava
{
    public static void main(String[] args)
    {
        Rabbit rabbit = new Rabbit();
        hawk Hawk = new hawk();
        fish Fish = new fish();
        
        rabbit.flee();
        Hawk.hunt();
        Fish.flee();
        Fish.hunt();
    }
}
