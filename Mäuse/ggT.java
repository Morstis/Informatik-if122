package Mäuse;

public class ggT {

    public static void main(String[] args) {
        ggT(12, 36);
    }

    private static int ggT(int a, int b) {
        int r;

        Trace trace = new Trace(new String[] { "r", "a", "b" });
        trace.next(2, new Object[] { "-", a, b });

        do {
            r = a % b;
            trace.next(4, new Object[] { r, a, b });
            a = b;
            trace.next(5, new Object[] { r, a, b });
            b = r;
            trace.next(6, new Object[] { r, a, b });

        } while (b != 0);
        if (a < 0)
            a = -a;
        return a;
    }
}
