package Task5;

import java.util.ArrayList;
import java.util.Random;

public class Action {
    private static int dice(int amtDice, int amtSidesOfDice) {
        Random random = new Random();
        int result = 0;
        for (int i = 0; i < amtDice; i++) {
            result += random.nextInt(amtSidesOfDice) + 1;
        }
        return result;
    }

    public static boolean hitCheck(Craeture attacker, Craeture defender) {
        int attackerPower = dice(1, 20) + attacker.getAttackModifier();
        return attackerPower > defender.getArmorClass();
    }

    private static boolean chekToDo(Craeture craeture) {
        if (!craeture.isAlive()) {
            System.out.println(craeture.getName() + " уже мертв и не может быть выбран целью для действий");
            return true;
        } else return false;
    }

    public static void attack(Craeture attacker, Craeture defender) throws InterruptedException {
        if (Action.chekToDo(attacker)) return;
        if (Action.chekToDo(defender)) return;
        Thread.sleep(150);
        System.out.println(attacker.getName() + " атакует " + defender.getName());
        if (Action.hitCheck(attacker, defender)) {
            Thread.sleep(150);
            int damageDeal = dice(1, attacker.getDamage()) + attacker.getDamageModifier();
            defender.setHp(defender.getHp() - damageDeal);
            System.out.println(attacker.getName() + " наностит существу " + defender.getName() + " " + damageDeal + " урона");
            if (!defender.isAlive()) {
                Thread.sleep(150);
                System.out.println(defender.getName() + " погибает");
                if (defender instanceof Hero) {
                    Hero.getAllHero().remove(defender);
                } else if (defender instanceof Enemy) {
                    Enemy.getAllEnemy().remove(defender);
                }
            }
        } else {
            Thread.sleep(500);
            System.out.println("Промах!");
        }
    }

    public static boolean fight(ArrayList<Craeture> group1, ArrayList<Craeture> group2) throws InterruptedException {
        Random randomCreature = new Random();
        for (Craeture attacker : group1) {
            if (group2.isEmpty()) {
                return false;
            }
            int indexOfCreature = randomCreature.nextInt(group2.size());
            Action.attack(attacker, group2.get(indexOfCreature));
        }
        for (Craeture attacker : group2) {
            if (group1.isEmpty()) {
                return false;
            }
            int indexOfCreature = randomCreature.nextInt(group1.size());
            Action.attack(attacker, group1.get(indexOfCreature));
        }
        return true;
    }
}



