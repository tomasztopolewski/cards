package pl.tomasztopolewski.cards;

public abstract class Gold {
    int gold;
    final static int initialValueOfGold = 10000;

    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold >= 0 ? gold : 0;
    }
    public void addGold(int gold) {
        this.gold = this.gold + gold > 0 ? gold : 0;
        System.out.println("GAME-INFO: Dodano " + gold + " szt. złota.");
    }
    public void subtractGold(int gold) {
        this.gold = this.gold - gold >= 0 ? gold : 0;
        System.out.println("GAME-INFO: Odjęto " + gold + " szt. złota.");
    }
}
