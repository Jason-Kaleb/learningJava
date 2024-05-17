package mainclass;

public class Task
{
    String taskName;
    int taskId;
    int taskWage;
    String taskDescription;
    
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
    
    public Task(String taskName, int taskId, int taskWage, String taskDescription)
    {
        this.taskName = taskName;
        this.taskId = taskId;
        this.taskWage = taskWage;
        this.taskDescription = taskDescription;
    }
    
    @Override
    public String toString()
    {
        return ("\tName: " + taskName + "\n\tID: " + taskId + "\n\tWage: " + taskWage);
    }
    
    // getter method for taskDescription
    
    public String getTaskDescription()
    {
        return taskDescription;
    }
}
