package writinginfile;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/*
    FileWriter: allows you
    to Write content
    into a file 
*/

public class WritingInFile
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            FileWriter writer = new FileWriter("myFile.txt");
            File file = new File("myFile.txt");
            
            if (file.exists())
            {
                writer.write("My name is Jason\nI am a Software Developer Engineer in the making\n");
                writer.append("--By Jason Kaleb\n");
                writer.append("\nFile Name: " + file.getPath());
                writer.close();
            }
            else
            {
                System.out.println("File does not exist!");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
