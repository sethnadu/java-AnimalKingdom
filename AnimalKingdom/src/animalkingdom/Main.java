package animalkingdom;

import java.util.*;

public class Main
{
    public static void showAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester)
    {
        for(AbstractAnimals a : animals)
        {
            if(tester.test(a))
            {
                System.out.println("Species: " + a.getSpecies() + ", Name: " + a.getName() + ", Breath: " + a.getBreath() + ", Year Named: " + a.getYear() + ", Moves: " + a.getMove() + ", Reproduce: " + a.getReproduce());
            }
        }
    }
    public static void main(String [] args)
    {
    //Mammals
    Mammals panda = new Mammals(0, "Panda", 1869);
    Mammals zebra = new Mammals(1, "Zebra", 1778);
    Mammals koala = new Mammals(2, "Koala", 1816);
    Mammals sloth = new Mammals(3, "Sloth", 1804);
    Mammals armadillo = new Mammals(4, "Armadillo", 1758);
    Mammals raccoon = new Mammals(5, "Raccoon", 1758);
    Mammals bigfoot = new Mammals(6, "Bigfoot", 2021);

    //Birds
    Birds pigeon = new Birds(7, "Pigeon", 1837);
    Birds peacock = new Birds(8, "Peacock", 1821);
    Birds toucan = new Birds(9, "Toucan", 1758);
    Birds parrot = new Birds(10, "Parrot", 1824);
    Birds swan = new Birds(11, "Swan", 1758);

    //Fish
    Fish salmon = new Fish(12, "Salmon", 1758);
    Fish catfish = new Fish(13, "Catfish", 1817);
    Fish perch = new Fish(14, "Perch", 1758);

    ArrayList<AbstractAnimals> animalList = new ArrayList <AbstractAnimals>();
    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigfoot);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    //============= SYSTEM OUT INFO BELOW =================//

    System.out.println();
    System.out.println("** All Animals ** ");
    System.out.println(animalList.toString());
    System.out.println();

    System.out.println("*** Sorting ***");
    System.out.println();
    
    System.out.println("* Animals sorted Alphabetically by Name");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("* Animals sorted decending order by Year Named*");
    animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("* Animals sorted by how they move *");
    animalList.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("* Animals breath with lungs *");
    showAnimals(animalList, a -> (a.getBreath() == "Lungs"));
    System.out.println();

    System.out.println("* Animals breath with lungs and named in 1758 *");
    showAnimals(animalList, ((a -> a.getBreath() == "Lungs" && a.getYear() == 1758)));
    System.out.println();

    System.out.println("* Animals breath with lungs and lay eggs");
    showAnimals(animalList, ((a -> a.getBreath() == "Lungs" && a.getReproduce() == "Eggs")));
    System.out.println();

    System.out.println("* Animals sorted alphabetically and named in 1758 *");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    showAnimals(animalList, (a -> a.getYear() == 1758));
    System.out.println();

    System.out.println("* Alphabetically sorted Mammals");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    showAnimals(animalList, (a -> a.getSpecies() == "Mammals"));
    System.out.println();

    System.out.println("* Alphabetically sorted Birds");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    showAnimals(animalList, (a -> a.getSpecies() == "Birds"));
    System.out.println();

    System.out.println("* Alphabetically sorted Fish");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    showAnimals(animalList, (a -> a.getSpecies() == "Fish"));
    System.out.println();
    }
}