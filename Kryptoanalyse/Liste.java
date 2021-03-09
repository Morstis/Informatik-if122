package Kryptoanalyse;

public class Liste<T extends Vergleichbar> {

    Knoten first;

    Liste() {
    }

    Liste(T[] input) {
        for (T t : input) {
            this.hinzufuegen(t);
        }
    }

    class Knoten {
        T daten;
        Knoten next;

        Knoten(T daten) {
            this.daten = daten;
            this.next = null;
        }
    }

    public boolean hinzufuegen(T element) {
        if (first == null) {
            first = new Knoten(element);
            return true;
        } else {
            if (!istElement(element)) {
                Knoten neuerKnoten = new Knoten(element);
                neuerKnoten.next = first;
                first = neuerKnoten;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean istElement(T element) {
        boolean vorhanden = false;
        Knoten knoten = first;
        while (knoten != null) {
            if (knoten.daten.equals(element)) {
                vorhanden = true;
                break;
            }
            knoten = knoten.next;
        }
        return vorhanden;
    }

    public boolean loeschen(T element) {
        Knoten knoten = first;
        Knoten vorgaenger = null;
        while (knoten != null) {
            if (knoten.daten.equals(element)) {
                if (vorgaenger == null) {
                    first = first.next;
                } else {
                    vorgaenger.next = knoten.next;
                }
                return true;
            }
            vorgaenger = knoten;
            knoten = knoten.next;
        }
        return false;
    }

    public void sortieren() {
        Knoten k1 = first, k2;
        int h;
        while (k1 != null && k1.next != null) {
            k2 = k1.next;
            while (k2 != null) {
                if (k2.daten.kleiner(k1.daten)) {
                    h = k1.daten.wert;
                    k1.daten.wert = k2.daten.wert;
                    k2.daten.wert = h;
                }
                k2 = k2.next;
            }
            k1 = k1.next;
        }
    }

    public String toString() {
        String ausgabe = "{";
        Knoten knoten = first;
        while (knoten != null) {
            ausgabe += knoten.daten;
            if (knoten.next != null)
                ausgabe += ", ";
            knoten = knoten.next;
        }
        ausgabe += "}";
        return ausgabe;
    }

}