package Task5;

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

    private static boolean chekToDo(Craeture craeture){
        if (!craeture.isAlive()){
            System.out.println(craeture.getName()+" уже мертв и не может быть выбран целью для действий");
            return true;
        }else return false;
    }

    public static void attack(Craeture attacker, Craeture defender) {
        if (Action.chekToDo(attacker)) return;
        if (Action.chekToDo(defender)) return;
        System.out.println(attacker.getName() + " атакует " + defender.getName());
        if (Action.hitCheck(attacker, defender)) {
            int damageDeal = dice(1, attacker.getDamage()) + attacker.getDamageModifier();
            defender.setHp(defender.getHp() - damageDeal);
            System.out.println(attacker.getName() + " наностит существу " + defender.getName() + " " + damageDeal + " урона");
            if (!defender.isAlive()) {
                System.out.println(defender.getName() + " погибает");
            }
        } else {
            System.out.println("Промах!");
        }
    }
}
