public abstract class DefenseBuilding extends Building {
    protected int damage;

    public DefenseBuilding(String name, int health, int damage, int level) {
        super(name, health, level);
        this.damage = damage;
    }

    public abstract void attack(Troop troop);
}
