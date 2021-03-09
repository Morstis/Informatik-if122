package Kryptoanalyse;

public class Liste<T> {

    private Knoten first;
    public int length;

    Liste() {
    }

    Liste(T[] input) {
        for (T t : input) {
            this.add(t);
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

    public boolean addIfNotIn(T element) {
        if (first == null) {
            first = new Knoten(element);
            this.length++;
            return true;

        } else {
            if (!istElement(element)) {
                Knoten neuerKnoten = new Knoten(element);
                neuerKnoten.next = first;
                first = neuerKnoten;
                this.length++;
                return true;
            } else {
                return false;
            }
        }
    }

    public void add(T element) {
        if (first == null) {
            first = new Knoten(element);
        } else {
            Knoten neuerKnoten = new Knoten(element);
            neuerKnoten.next = first;
            first = neuerKnoten;
        }
        this.length++;

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
                this.length--;
                return true;
            }
            vorgaenger = knoten;
            knoten = knoten.next;
        }
        return false;
    }

    public T get(int index) {
        Knoten knoten = first;

        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return knoten.daten;
            }
            knoten = knoten.next;
        }
        return null;
    }

    public T replace(int index, T data) {
        Knoten knoten = first;

        for (int i = 0; i <= index; i++) {
            if (i == index) {
                knoten.daten = data;
            }
            knoten = knoten.next;
        }
        return null;
    }

    public Liste<Integer> getIndexesofData(T data) {
        Liste<Integer> indexes = new Liste<Integer>();
        Knoten knoten = first;
        for (int i = 0; knoten != null; i++) {
            if (knoten.daten.equals(data)) {
                indexes.add(i);
            }
            knoten = knoten.next;
        }
        return indexes;

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