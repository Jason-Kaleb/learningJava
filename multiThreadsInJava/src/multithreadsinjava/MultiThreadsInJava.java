package multithreadsinjava;

/*
    multithreading = process of executing multiple threads simultaneously
                     Helps maximum utilization of CPU
                     Threads are independent, they dont affect the execution of other threads
                     An exception in one thread will not interrupt other threads
                     useful for servicing multiple clients, multi-player games, or other mutually independent tasks
*/

public class MultiThreadsInJava
{
    public static void main(String[] args) throws InterruptedException
    {
        // Two ways of creating Threads 
        // 1. Creating a subclass of Thread
        // 2. Implement Runnable interface and pass instance an as argument to Thread
        
        MyThread thread1 = new MyThread();
        myRunnable runnable1 = new myRunnable();
        Thread thread2 = new Thread(runnable1);
        
        // The join() method in Java is provided by the java.lang.Thread class and it essentially allows one thread to wait for another thread to finish its execution
        
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
