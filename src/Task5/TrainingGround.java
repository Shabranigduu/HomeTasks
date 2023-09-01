package Task5;

public class TrainingGround {
    public static void main(String[] args) throws InterruptedException {

        boolean run = true;

        Warior warior = new Warior("Крилт");
        Mage mage = new Mage("Гримэл");
        Rogue rogue = new Rogue("Астор");
        Cleric cleric = new Cleric("Филса");
        Goblin goblin = new Goblin();
        Goblin goblin1 = new Goblin();
        Goblin goblin2 = new Goblin();
        Goblin goblin3 = new Goblin();
        Goblin goblin4 = new Goblin();
        Orc orc = new Orc();
        Orc orc1 = new Orc();
        Orc orc2 = new Orc();
        Ogre ogre = new Ogre();

        while (run) {
            run = Action.fight(Hero.getAllHero(), Enemy.getAllEnemy());
        }
        if (Enemy.getAllEnemy().isEmpty()) {
            System.out.println("\nГруппа героев побеждает в сражении!");
        } else {
            System.out.println("\nГруппа героев позорно погибает в сражении!");
        }
    }
}
