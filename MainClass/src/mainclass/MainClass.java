package mainclass;

class WorkerThread_0 extends Thread
{
    private final Task task;
    
    public WorkerThread_0(Task task)
    {
        this.task = task;
    }
    
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            Thread currentThread = Thread.currentThread();
            currentThread.setName("Display_Task_Info");

            System.out.println("Task Details: \n" + task);
            System.out.println();
            System.out.println("Thread Name: " + currentThread.getName());
            System.out.println("Thread Status: " + currentThread.getState());
            System.out.println("Thread Priority: " + currentThread.getPriority());  
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class WorkerThread_1 extends Thread
{
    private final Task task;
    
    public WorkerThread_1(Task task)
    {
        this.task = task;
    }
    
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(2500);
            Thread currentThread = Thread.currentThread();
            currentThread.setName("Display_Task_Additional_Info");

            System.out.println("\nTask Details: \n" + task);
            System.out.println("\tDescription: " + task.getTaskDescription());
            System.out.println();
            System.out.println("Thread Name: " + currentThread.getName());
            System.out.println("Thread Status: " + currentThread.getState());
            System.out.println("Thread Priority: " + currentThread.getPriority());  
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

public class MainClass
{
    public static void main(String[] args) throws InterruptedException
    { 
        Task task = new Task("Working", 1234, 20000);
        Task secondTask = new Task("Security", 12435, 200012, "Guarding entrance of a mall during the night");
        
        WorkerThread_0 workerThread = new WorkerThread_0(task);
        WorkerThread_1 workerThread_1 = new WorkerThread_1(secondTask);
        
        workerThread.start();
        workerThread_1.start();
    }
}
