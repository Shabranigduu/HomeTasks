package Task5;

public class Orc extends Enemy{
    private static final String CREATURE_NAME = "Орк";
    private int count;

    public Orc() {
        super(CREATURE_NAME, 12, 10, 6);
        count++;
        setName(getName()+count);
    }
}
