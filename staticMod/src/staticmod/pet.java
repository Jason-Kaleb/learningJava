package staticmod;

public class pet
{
    String name;
    String breed;
    int age;
    static int numberOfPets;
    
    // overloaded constructors
    pet()
    {
        name = "";
        age = 0;
        breed = "";
        numberOfPets++;
    }
    
    pet(String n, int a, String b)
    {
        name = n;
        age = a;
        breed = b;
        numberOfPets++;
    }
    
    //methods and static methods
    
    void eat()
    {
        System.out.println(name + " is currently eating.");
    }
    
    void displayPet()
    {
        System.out.println("Pet name: " + name);
        System.out.println("Pet age: " + age);
        System.out.println("Pet breed: " + breed);
    }
    
    static void displayNumberOfPets()
    {
        System.out.println("You have a total of " + numberOfPets + " pets");
    }
}
