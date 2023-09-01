package Task5;

public class Goblin extends Enemy{
    private static final String CREATURE_NAME = "Гоблин";
    private int count;

    public Goblin() {
        super(CREATURE_NAME, 6, 8, 4);
        count++;
        setName(getName()+count);
        setAttackModifier(1);
    }
}
