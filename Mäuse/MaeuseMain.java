package Mäuse;

public class MaeuseMain {
    public static void main(String[] args) {
        Mäuse mäuse = new Mäuse(6, 9, 12);

        Trace<Integer> trace = new Trace<Integer>(new String[] { "Jung", "Erwachsen", "Alt" }, true);

        for (int i = 0; i < 10; i++) {
            trace.next(mäuse.gibSchritt(),
                    new Integer[] { mäuse.gibJung(), mäuse.gibErwachsen(), mäuse.gibErwachsen() });
            mäuse.macheSchritt();
        }

    }
}
