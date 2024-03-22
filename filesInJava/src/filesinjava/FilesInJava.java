package filesinjava;

import java.io.File;

/*
    file: abstract representation
    of file and directory pathnames
*/

public class FilesInJava
{
    public static void main(String[] args)
    {
        File file = new File("myFile.txt");
        
        if (file.exists())
        {
            System.out.println("The file exists!");
            System.out.println(file.getPath());  // .getPath() method gets path
            System.out.println(file.getAbsoluteFile()); // .getAbsoluteFile() method gets the whole path
            System.out.println(file.isFile());
            // file.delete(); deletes the file
        }
        else
        {
            System.out.println("The file does not exist!");
        }
    }
}
