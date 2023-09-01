package Task5;

public class Rogue extends Hero{

    private static final String CLASS = "Плут ";

    public Rogue(String name){
        super(name, 12, 14, 12);
        setName(CLASS+getName());
    }
}
