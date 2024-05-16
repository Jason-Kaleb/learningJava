package question1;

public class employee
{
    public String Name, Surname;
    public int yearsWorked;
    public int Salary;
    
    // constructor
    public employee()
    {
        this.Name = "";
        this.Surname = "";
        this.yearsWorked = 0;
        this.Salary = 0;
    }
    
    public employee(String Name, String Surname, int yearsWorked, int Salary)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.yearsWorked = yearsWorked;
        this.Salary = Salary;
    }
}
