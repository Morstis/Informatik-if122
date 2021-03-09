package Kryptoanalyse;

public abstract class Vergleichbar {

    public int wert;

    public abstract boolean equals(Vergleichbar v);

    public abstract boolean kleiner(Vergleichbar vergleichbar);

    public abstract boolean größer(Vergleichbar vergleichbar);

}