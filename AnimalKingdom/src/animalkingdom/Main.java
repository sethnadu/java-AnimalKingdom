package animalkingdom;

import java.util.*;

public class Main
{
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

    }
}