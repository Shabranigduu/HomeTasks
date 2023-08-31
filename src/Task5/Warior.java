package Task5;

public class Warior extends Hero{

    private final String CLASS = "Воин ";

    public Warior(String name){
        super(name, 20, 15, 8);
        setName(CLASS+getName());
    }
}
