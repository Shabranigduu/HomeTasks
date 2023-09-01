package Task5;

public class Cleric extends Hero{

    private static final String CLASS = "Клирик ";

    public Cleric(String name){
        super(name, 14, 12, 6);
        setName(CLASS+getName());
    }
}
