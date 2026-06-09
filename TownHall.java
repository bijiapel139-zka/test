public class TownHall {

    private int townhallId;
    private int level;
    private int hp;

    // Foreign Key: setiap TownHall dimiliki oleh 1 Player
    private Player player;

    public TownHall(int townhallId, int level, int hp) {
        this.townhallId = townhallId;
        this.level = level;
        this.hp = hp;
    }

    // Getter & Setter
    public int getTownhallId() {
        return townhallId;
    }

    public void setTownhallId(int townhallId) {
        this.townhallId = townhallId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "TownHall{" +
                "townhallId=" + townhallId +
                ", level=" + level +
                ", hp=" + hp +
                ", player=" + (player != null ? player.getPlayerId() : "No Player") +
                '}';
    }
}

