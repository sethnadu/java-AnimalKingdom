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


}