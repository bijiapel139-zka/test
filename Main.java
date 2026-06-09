public class Main {
    public static void main(String[] args) {
        Barbarian barb = new Barbarian(2);
        Archer archer = new Archer(1);

        Cannon cannon = new Cannon(1);
        ArcherTower tower = new ArcherTower(1);

        barb.attack();
        cannon.attack(barb);

        archer.attack();
        tower.attack(archer);

        barb.specialSkill();
        barb.attack();
    }
}
