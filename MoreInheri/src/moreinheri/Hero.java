package moreinheri;

public class Hero extends Person 
{
    String power;
    
    Hero(String nam, int ag, String pow)
    {
        super(nam, ag);
        power = pow;
    }
    
    public String toString()
    {
        return super.toString() + this.power;
    }
}
