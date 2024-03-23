package readingfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    description: FileReader, reads
    the contents of a file as a stream
    of characters. One by one
    read() returns an int value which contains
    the byte value 
    when read() returns -1, there is no more data
    to be read.
*/

public class ReadingFiles
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            
            while (data != -1)
            {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
