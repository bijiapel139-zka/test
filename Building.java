public abstract class Building {
    protected String name;
    protected int health;
    protected int level;

    public Building(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " terkena " + damage + " damage. Sisa HP: " + health);
    }

    public boolean isDestroyed() {
        return health <= 0;
    }
}

