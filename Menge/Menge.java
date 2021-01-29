package Menge;

// Jap ich mache kein extends Stack<T> auch wenn es schöner wäre, aber 
// dann müsste ich nen Iterator schreiben, oder die Knoten public machen. 
// Beides ist momentan nicht wünschenswert.

public class Menge<T> {

    Knoten last;

    class Knoten {
        T data;
        Knoten next;

        Knoten(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T element) {
        if (!this.contains(element)) {
            Knoten knoten = new Knoten(element);
            knoten.next = last;
            last = knoten;
        }
    }

    public boolean contains(T element) {
        Knoten k = last;
        while (k != null) {
            if (element == k.data) {
                return true;
            }
            k = k.next;
        }
        return false;
    }

    public void remove(T element) {
        if (this.contains(element)) {
            // Jap ist äußerst hässlich, kann ich aber grade nicht ändern
            // Ich wüsste nicht wie, eine andere Datenstruktur als ein
            // Stack würde sicherlich Sinn ergeben.
            Knoten k = last;
            while (k != null) {

                if (k.data == element) {
                    last = k.next;
                    break;
                }
                if (k.next != null && element == k.next.data) {
                    k.next = k.next.next;
                }
                k = k.next;

            }
        }
    }

    public boolean isEmpty() {
        return last != null;
    }

    @Override
    public String toString() {
        String out = "";
        Knoten k = last;
        while (k != null) {
            out = k.data + " " + out;
            k = k.next;
        }
        return out;
    }

}
