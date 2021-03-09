package Kryptoanalyse;

public class Zahl extends Vergleichbar {

    Zahl(int wert) {
        this.wert = wert;
    }

    public boolean equals(Vergleichbar vergleichbar) {
        return wert == vergleichbar.wert;
    }

    public boolean kleiner(Vergleichbar vergleichbar) {
        return wert < vergleichbar.wert;
    }

    public boolean größer(Vergleichbar vergleichbar) {
        return wert > vergleichbar.wert;
    }

    @Override
    public String toString() {
        return String.valueOf(wert);
    }
}