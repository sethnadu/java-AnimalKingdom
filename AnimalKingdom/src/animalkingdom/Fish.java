package animalkingdom;

public class Fish extends AbstractAnimals
{
    public Fish(int id, String name, int year) 
    {
        super(id, name, year);

    }

    @Override
    public String getMove()
    {
        return "Swim";
    }

    @Override 
    public String getBreath()
    {
        return "Gills";
    }

    @Override
    public String getReproduce()
    {
        return "Eggs";
    }


}