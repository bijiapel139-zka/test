public class Player {

    private int playerId;
    private String name;
    private int elixir;
    private int gold;

    // Relasi ONE-TO-ONE dengan TownHall
    private TownHall townHall;

    public Player(int playerId, String name, int elixir, int gold) {
        this.playerId = playerId;
        this.name = name;
        this.elixir = elixir;
        this.gold = gold;
    }

    // Getter & Setter
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public TownHall getTownHall() {
        return townHall;
    }

    public void setTownHall(TownHall townHall) {
        this.townHall = townHall;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", name='" + name + '\'' +
                ", elixir=" + elixir +
                ", gold=" + gold +
                ", townHall=" + (townHall != null ? townHall.getTownhallId() : "No TownHall") +
                '}';
    }
}
