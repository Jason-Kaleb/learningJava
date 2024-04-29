package question1;

public class employee
{
    public String Name, Surname;
    public int yearsWorked;
    public double Salary;
    
    // constructor
    public employee()
    {
        this.Name = "";
        this.Surname = "";
        this.yearsWorked = 0;
        this.Salary = 0.0;
    }
    
    public employee(String Name, String Surname, int yearsWorked, double Salary)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.yearsWorked = yearsWorked;
        this.Salary = Salary;
    }
}
