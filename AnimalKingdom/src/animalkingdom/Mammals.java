package animalkingdom;

public class Mammals extends AbstractAnimals
{
    public Mammals(int id, String name, int year) 
    {
        super(id, name, year);

    }

    @Override
    public String getMove()
    {
        return "Walk";
    }

    @Override 
    public String getBreath()
    {
        return "Lungs";
    }

    @Override
    public String getReproduce()
    {
        return "Live Births";
    }

    @Override
    public String toString()
    {
        return "\nMammals{" +
        "Id: '" + id + '\'' +
        ", Name: " + name + 
        ", Year: " + year + 
        ", Move: " + getMove() + 
        ", Breaths: " + getBreath() + 
        ", Reproduce: " + getReproduce() +
        '}';
    }


}