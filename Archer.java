public class Archer extends Troop {

    public Archer(int level) {
        super("Archer", 70 + (level * 15), 25 + (level * 6), level);
    }

    @Override
    public void specialSkill() {
        System.out.println("Archer menggunakan serangan jarak jauh!");
    }
}

