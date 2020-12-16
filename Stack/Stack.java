package Stack;

public class Stack<T> {

    Knoten last;

    class Knoten {
        T data;
        Knoten next;

        Knoten(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        Knoten knoten = new Knoten(data);
        knoten.next = last;
        last = knoten;
    }

    public T pop() {
        if (last != null) {
            Knoten knoten = last;
            last = last.next;
            return knoten.data;
        } else {
            return null;
        }
    }

    public T peek() {
        if (last != null) {
            return last.data;
        } else {
            return null;
        }
    }

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
