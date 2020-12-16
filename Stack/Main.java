package Stack;

public class Main {

    public static void main(String[] args) {

        Hanoi h = new Hanoi(6);

        h.move(8, 0, 2, 1);

        System.out.println(h.operations);
        // Die Operationen verdoppeln sich immer

        /*
         * 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8
         * 
         * 1 | 3 | 7 | 15 | 31 | 63 | 127 | 255
         */
    }
}
