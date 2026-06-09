public abstract class Troop {
    protected String name;
    protected int health;
    protected int damage;
    protected int level;

    public Troop(String name, int health, int damage, int level) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.level = level;
    }

    public void attack() {
        System.out.println(name + " menyerang dengan damage " + damage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " menerima " + damage + " damage. Sisa HP: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void specialSkill();
}
