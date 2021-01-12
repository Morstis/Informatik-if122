package snake;

public class Schlange<T> {

    private Knoten kopf = null;
    private Knoten schwanz = null;
    private int laenge = 0;

    // Klasse Knoten
    class Knoten {
        Knoten naechsterKnoten;
        T daten = null;

        Knoten(T daten) {
            this.daten = daten;
            naechsterKnoten = null;
        }
    }

    public void fügeHinzu(T daten) {
        if (kopf == null) {
            kopf = new Knoten(daten);
            schwanz = kopf;
        } else {
            schwanz.naechsterKnoten = new Knoten(daten);
            schwanz = schwanz.naechsterKnoten;
        }
        laenge++;
    }

    public T gibKopfDaten() {
        return kopf.daten;
    }

    public T entferne() {
        Knoten k = kopf;
        kopf = kopf.naechsterKnoten;
        if (kopf == null) {
            schwanz = null;
        }
        laenge--;

        return k.daten;
    }

    public int gibLänge() {
        return this.laenge;
    }

    public String toString() {
        String s = "";
        Knoten k = kopf;
        while (k != null) {
            s += k.daten;
            if (k.naechsterKnoten != null)
                s += ", ";
            k = k.naechsterKnoten;
        }
        return s;
    }
}