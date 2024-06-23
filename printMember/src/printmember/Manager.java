package printmember;

public class Manager extends Member
{
    private String Specialization;
    private String Department;
    
    public Manager(String name, int age, String phoneNumber, String address, double salary, String specialization, String department)
    {
        super(name, age, phoneNumber, address, salary);
        this.Specialization = specialization;
        this.Department = department;
    }
    
    public void displayManagerInfo()
    {
        super.displayInfo();
        System.out.println("Specialization: " + Specialization);
        System.out.println("Department: " + Department);
    }
}
