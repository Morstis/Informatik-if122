package Stack;

public class Hanoi {

    // Eigentlich ist alles typeSafe. Komische Warnung, denn sie trifft nicht zu.
    @SuppressWarnings("unchecked")
    Stack<Integer>[] s = new Stack[] { new Stack<Integer>(), new Stack<Integer>(), new Stack<Integer>() };

    int n;

    Hanoi(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            this.s[0].push(i);
        }
    }

    public void move(int n, int from, int to) {

        if (n == 1) {
            s[to].push(s[from].pop());
            System.out.println(toString()

            );

        } else {
            this.move(n - 1, 0, 2);
            this.move(n - 1, 0, 1);
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            s += "T" + i + ": " + this.s[i].toString() + "\n";
        }
        return s;
    }

}