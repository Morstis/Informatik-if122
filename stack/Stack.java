package stack;

public class Stack<T> {

    Knoten kRef;

    public class Knoten {
        T data;
        Knoten last;

        Knoten(T data) {
            this.data = data;
        }
    }

    public T pop() {
        Knoten last = this.kRef;
        this.kRef = last.last;
        return last.data;
    }

    public T peek() {
        return this.kRef.data;
    }

    public void push(T data) {
        if (isEmpty()) {
            this.kRef = new Knoten(data);
        } else {
            Knoten last = this.kRef;
            this.kRef = new Knoten(data);
            this.kRef.last = last;
        }
    }

    public boolean isEmpty() {
        return this.kRef == null;
    }
}
