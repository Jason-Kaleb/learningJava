package question2;

public class Task
{
    private String taskName;
    private int taskId;
    private int taskWage;
    
    // default Contructor and Constructor that initializes values
    
    public Task()
    {
        this.taskName = "";
        this.taskId = 0;
        this.taskWage = 0;
    }
    
    public Task(String taskName, int taskId, int taskWage)
    {
        this.taskName = taskName;
        this.taskId = taskId;
        this.taskWage = taskWage;
    }
    
    @Override
    public String toString()
    {
        return ("Task Name: " + taskName + "\nTask ID: " + taskId + "\nTask Wage: " + taskWage);
    }
}
