package Kryptoanalyse;

public class EntfernungHaef {

    public int entfernung;

    public int haeufigkeit = 0;

    EntfernungHaef(int entfernung) {
        this.entfernung = entfernung;
    }

    public void increase() {
        haeufigkeit++;
    }

    @Override
    public String toString() {
        return "{ " + this.entfernung + ", " + this.haeufigkeit + " }";
    }
}
