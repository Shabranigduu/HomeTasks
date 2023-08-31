package Task5;

public abstract class Craeture implements Mortal{
    private String name;
    private int hp;
    private int armorClass;
    private int attackModifier;
    private int damageModifier;
    private int damage;

    public Craeture(String name, int hp, int armorClass, int damage) {
        this.name = name;
        this.hp = hp;
        this.armorClass = armorClass;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    @Override
    public boolean isAlive() {
        return getHp()>0;
    }

}
