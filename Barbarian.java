public class Barbarian extends Troop {

    public Barbarian(int level) {
        super("Barbarian", 100 + (level * 20), 20 + (level * 5), level);
    }

    @Override
    public void specialSkill() {
        System.out.println("Barbarian mengamuk! Damage meningkat 2x!");
        damage *= 2;
    }
}

