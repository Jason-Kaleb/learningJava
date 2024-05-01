package question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question1 
{
    public static void main(String[] args)
    {
        String fileName = "employee.txt";
        String[] columnNames = {"Name\t", "\tSurname\t", "\tYears Worked\t", "\tSalary\t"};
        
        employee Employee1 = new employee("John", "Smith", 4, 15000);
        employee Employee2 = new employee("Ayanda", "Dube", 10, 200000);
        employee Employee3 = new employee("Damien", "Naidoo", 5, 65000);
        
        try (FileReader reader = new FileReader(fileName))
        {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(fileName);
       
            if (file.exists())
            {
                fileWriter.write(columnNames[0] + columnNames[1] + columnNames[2] + columnNames[3] + "\n");
                
                fileWriter.append("\n" + Employee1.Name + "\t\t" + Employee1.Surname + "\t\t" + Employee1.yearsWorked + "\t\t\t" + Employee1.Salary);
                fileWriter.append("\n\n" + Employee2.Name + "\t\t" + Employee2.Surname + "\t\t" + Employee2.yearsWorked + "\t\t\t" + Employee2.Salary);
                fileWriter.append("\n\n" + Employee3.Name + "\t\t" + Employee3.Surname + "\t\t" + Employee3.yearsWorked + "\t\t\t" + Employee3.Salary + "\n");
                
                fileWriter.close();
            }
            else
            {
                System.out.println("The file (" + fileName + ") does not exist!");
            }
            
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
