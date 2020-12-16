package Stack;

public class Hanoi {

    // Eigentlich ist alles typeSafe. Komische Warnung, denn sie trifft nicht zu.
    @SuppressWarnings("unchecked")
    Stack<Integer>[] s = new Stack[] { new Stack<Integer>(), new Stack<Integer>(), new Stack<Integer>() };

    int n;
    int operations = 0;

    Hanoi(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            this.s[0].push(i);
        }
    }

    public void move(int n, int from, int to, int third) {
        this.operations++;
        if (n == 1) {
            s[to].push(s[from].pop());
            System.out.println(toString());

        } else {
            this.move(n - 1, from, third, to);
            s[to].push(s[from].pop());
            System.out.println(toString());
            this.move(n - 1, third, to, from);

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