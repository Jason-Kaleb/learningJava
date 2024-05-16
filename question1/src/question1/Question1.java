package question1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
        
        // Colunm names for employee data to write in employee.txt
        String[] columnNames = {"Name\t", "\tSurname\t", "\tYears Worked\t", "\tSalary\t"};
        
        // StringBuilder to store updated employee information or information whether its updated or not
        StringBuilder updatedInfo = new StringBuilder();
        
        // Create employee objects with initial data to store or write in file
        employee Employee1 = new employee("John", "Smith", 4, 15000);
        employee Employee2 = new employee("Ayanda", "Dube", 10, 200000);
        employee Employee3 = new employee("Damien", "Naidoo", 5, 65000);
        
        try
        {
            File file = new File(fileName);
            String line;
            
            // Check if the file exists
            if (file.exists())
            {
                // FileWriter to write to the file
                FileWriter fileWriter = new FileWriter(fileName);
                
                // Here i am writing column names into the file
                fileWriter.write(columnNames[0] + columnNames[1] + columnNames[2] + columnNames[3]);
                
                // Here i am appending column names to updatedInfo StringBuilder
                updatedInfo.append(columnNames[0]).append(columnNames[1]).append(columnNames[2]).append(columnNames[3]).append("\n");
                
                // Append employee data to the file and updatedInfo StringBuilder
                fileWriter.append("\n" + Employee1.Name + "\t\t" + Employee1.Surname + "\t\t" + Employee1.yearsWorked + "\t\t\t" + Employee1.Salary);
                fileWriter.append("\n" + Employee2.Name + "\t\t" + Employee2.Surname + "\t\t" + Employee2.yearsWorked + "\t\t\t" + Employee2.Salary);
                fileWriter.append("\n" + Employee3.Name + "\t\t" + Employee3.Surname + "\t\t" + Employee3.yearsWorked + "\t\t\t" + Employee3.Salary);
                
                fileWriter.close();
            }
            else
            {
                System.out.println("The file (" + fileName + ") does not exist!");
            }
            
            // BufferedReader to read from the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            
            
            // Here i use a while loop to loop through each line in the file
            while ((line = reader.readLine()) != null)
            {
                // Here i am splitting the line read from the file into an array of employee fields, using whitespace as the delimiter
                String[] employeeFields = line.split("\\s+");
              
                if (employeeFields.length != 4)
                {
                    //System.out.println("Invalid line format in employee.txt: " + line + "\n");
                    continue;
                }
                
                // Extracting employee information from the array - employeeFields
                String name = employeeFields[0];
                String surname = employeeFields[1];
                int yearsWorked = Integer.parseInt(employeeFields[2]);
                int salary = Integer.parseInt(employeeFields[3]);
                
                // Updating salary based on years worked
                if (yearsWorked < 5)
                {
                    salary *= 1.05;
                }
                else if (yearsWorked <= 10)
                {
                    salary *= 1.15;
                }
                else
                {
                    salary *= 1.3;
                }
                
                // Print and append updated employee information to updatedInfo StringBuilder
                // System.out.println(name + "\t\t" + surname + "\t\t" + yearsWorked + "\t\t\t" + salary);
                updatedInfo.append(name).append("\t\t").append(surname).append("\t\t").append(yearsWorked).append("\t\t\t").append(salary).append("\n");
            }
            reader.close();
            
            
            // Here i am writing to the file again - the updated employee information is being written
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)))
            {
                writer.write(updatedInfo.toString());
            } 
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("\nEmployee salaries updated successfully.\n");
            
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
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
