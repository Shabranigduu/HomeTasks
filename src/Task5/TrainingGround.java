package Task5;

public class TrainingGround {
    public static void main(String[] args) {

        Warior warior = new Warior("Добрыня Никитич");
         Goblin goblin = new Goblin();

         Action.attack(warior, goblin);
         Action.attack(goblin, warior);
         Action.attack(warior, goblin);
        Action.attack(goblin, warior);
         Action.attack(warior, goblin);
        Action.attack(goblin, warior);
         Action.attack(warior, goblin);
    }
}
