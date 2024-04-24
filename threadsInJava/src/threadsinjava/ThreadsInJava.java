package threadsinjava;

/*
    thread = A thread of execution in a program (kind of like a virtual CPU
             The JVM allows an application to have multiple threads running concurrently
             Each thread can Execute parts of your code in parallel with the main thread
             Each thread has a priority
             Threads with higher priority are executed in preference compared to a lower priority.

             The Java Virtual Machine continues to execute threads until the following occurs:
                1. The exit method of class runtime has been called
                2. All user threads have died
             
             When a JVM starts up there is a thread which calls the main method
             This thread is called "main"

             Two types of threads:
                1. Daemon threads
                2. User threads

             Daemon thread is a low priority thread that runs in the background to perform tasks such as garbage collection
             JVM terminates itself when all user threads (non-daemon threads) finish their execution
*/  

public class ThreadsInJava
{
    public static void main(String[] args) throws InterruptedException
    {
        /*
        // checking how many threads are active
        System.out.println(Thread.activeCount());
        
        // To get name of Thread
        System.out.println(Thread.currentThread().getName());
        
        // To set name of Thread or change Name of currentThread
        Thread.currentThread().setName("MAIN");
        System.out.println("New Thread Name: " + Thread.currentThread().getName());
        
        // To get priority of Thread
        System.out.println(Thread.currentThread().getPriority()); // Output: 5 - the higher the number the higher the priority between a scale of 1-10
        
        // Changing the priority of the Thread
        Thread.currentThread().setPriority(10);
        System.out.println("New Thread Priority: " + Thread.currentThread().getPriority());
        
        // To see if the currentThread is alive
        System.out.println(Thread.currentThread().isAlive());
        
        // Making your thread or program sleep
        for (int i = 3; i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000); // in milliseconds
        }
        
        System.out.println("You are done!");
        */
        
        // creating a second thread along with the main thread
        
        myThread thread2 = new myThread();
        
        thread2.setDaemon(true);
      
        thread2.start();
        System.out.println(thread2.isDaemon());
        //System.out.println(thread2.isAlive()); // if you dont start your thread it will output false so you have to start it like above
        
//        thread2.setName("Second Thread");
//        System.out.println(thread2.getName());
        
        // Inherits the priority of the main thread
        //System.out.println("Priority: " + thread2.getPriority());
        
        //System.out.println(Thread.activeCount());
        
    }
}
