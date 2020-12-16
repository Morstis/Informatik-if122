package Stack;

public class Main {

    public static void main(String[] args) {

        Hanoi h = new Hanoi(3);

        h.move(3, 0, 2);

        // Stack<Integer> s = new Stack<Integer>();
        // s.push(1);
        // s.push(3);
        // s.push(4);

        // System.out.println(s.pop());
        // System.out.println(s.peek());
    }
}
