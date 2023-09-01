package Task5;

import java.util.ArrayList;

public class Enemy extends Craeture {

    private static ArrayList<Craeture> allEnemy = new ArrayList<>();

    public Enemy(String name, int hp, int armorClass, int damage) {
        super(name, hp, armorClass, damage);
        allEnemy.add(this);
    }

    public static ArrayList<Craeture> getAllEnemy() {
        return allEnemy;
    }
}
