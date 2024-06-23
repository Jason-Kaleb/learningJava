package printmember;

public class Member
{
    private String Name;
    private int Age;
    private String PhoneNumber;
    private String Address;
    private double Salary;
    
    public Member(String name, int age, String phoneNumber, String address, double salary)
    {
        this.Name = name;
        this.Age = age;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.Salary = salary;
    }
    
    public void printSalary()
    {
        System.out.println("Salary: " + Salary);
    }
    
    public void displayInfo()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("PhoneNumber: " + PhoneNumber);
        System.out.println("Address: " + Address);
        System.out.println("Salary: R" + Salary);
    }
}
