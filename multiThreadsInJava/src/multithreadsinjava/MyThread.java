package multithreadsinjava;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Thread #1: " + i);
            
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Thread1 is finished");
    }
}
