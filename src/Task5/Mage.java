package Task5;

public class Mage extends Hero{

    private static final String CLASS = "Маг ";

    public Mage(String name){
        super(name, 12, 10, 20);
        setName(CLASS+getName());
    }
}
