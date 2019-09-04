package animalkingdom;

public abstract class AbstractAnimals 
{
    int id;
    String name;
    int year;

    public AbstractAnimals(int id, String name, int year)
    {
        this.id = id;
        this.name = name;
        this.year = year;
    }

   public abstract String getMove();
   public abstract String getBreath();
   public abstract String getReproduce();

}