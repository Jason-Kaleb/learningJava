package encapsulationinjava;

public class Car
{
    private String name;
    private String model;
    private int year;
    
    Car(String name, String model, int year)
    {
        this.setName(name);
        this.setModel(model);
        this.setYear(year);
        
        //because of the setter methods created this below is no longer needed and the above is better
        
        //this.name = name;
        //this.model = model;
        //this.year = year;
    }
    
    // getter methods - these are methods used to get the attributes of a class
    
    public String getName()
    {
        return (name);
    }
    
    public String getModel()
    {
        return (model);
    }
    
    public int getYear()
    {
        return (year);
    }
    
    // setter methods - these are methods used to set 
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
}
