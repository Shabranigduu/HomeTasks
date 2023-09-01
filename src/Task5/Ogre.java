package Task5;

public class Ogre extends Enemy{
    private static final String CREATURE_NAME = "Огр";
    private int count;

    public Ogre() {
        super(CREATURE_NAME, 30, 5, 10);
        count++;
        setName(getName()+count);
    }
}
