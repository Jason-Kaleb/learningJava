package printmember;

public class PrintMember
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Jason", 21, "+27699140517", "Eldorado Park 86 Goud Street", 2500000, "Software Engineering", "IT");
        Manager manager = new Manager("Gojo", 38, "+27699150618", "Joburg Park 86 Silver Street", 200000, "Software Engineering", "IT");
        
        System.out.println("Manager: \n");
        manager.displayManagerInfo();
        
        System.out.println();
        
        System.out.println("Employee: \n");
        employee.displayEmployeeInfo();
    }
}
