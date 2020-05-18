public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeOfSuperpowers;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSuperpowers() {
        return typeOfSuperpowers;
    }

    public void setTypeOfSuperpowers() {
        this.typeOfSuperpowers = typeOfSuperpowers;
    }
}
