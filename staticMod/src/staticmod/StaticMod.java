package staticmod;

/*
    Program: Covering static modifier
    static = modifier. A single copy of a
    variable/method is created and shared.
    The class "owns" the static member
*/

public class StaticMod 
{
    public static void main(String[] args) 
    {
        pet dog = new pet("Bailey", 1, "Short small dog");
        pet cat = new pet("Luna", 1, "Street Cat");
        pet monkey = new pet("Killua", 2, "Capuchin");
        
        dog.displayPet();
        dog.eat();
        cat.displayPet();
        cat.eat();
        monkey.displayPet();
        monkey.eat();
        
        // When accessing a static method/variable we use class name only and not name of class 
        
        System.out.println(pet.numberOfPets);
        pet.displayNumberOfPets();
    }
    
}
