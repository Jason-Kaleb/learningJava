package multithreadsinjava;

import java.util.logging.Level;
import java.util.logging.Logger;

public class myRunnable implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 10; i > 0; i--)
        {
            System.out.println("Thread #2: " + i);
            
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(myRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Thread2 is finished");
    }
}
