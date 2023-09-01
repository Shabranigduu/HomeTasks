package Task5;

import java.util.ArrayList;

public class Hero extends Craeture {

    private static ArrayList<Craeture> allHero = new ArrayList<>();

    Hero(String name, int hp, int armorClass, int damage) {
        super(name, hp, armorClass, damage);
        allHero.add(this);
    }

    public static ArrayList<Craeture> getAllHero() {
        return allHero;
    }
}
