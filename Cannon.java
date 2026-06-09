public class Cannon extends DefenseBuilding {

    public Cannon(int level) {
        super("Cannon", 200 + (level * 50), 30 + (level * 10), level);
    }

    @Override
    public void attack(Troop troop) {
        System.out.println("Cannon menembak " + troop.name);
        troop.takeDamage(damage);
    }
}

