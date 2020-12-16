package Matrix;

public class Main {
    public static void main(String[] args) {
        GLS m = new GLS(4, 5);

        for (int i2 = 0; i2 < m.sizeY(); i2++) {

            for (int i = 0; i < m.sizeX(); i++) {

                m.set(new Position(i, i2), Math.random());

            }

        }

        m.multZeileMitFaktor(2, 2);

        System.out.println(m);
    }
}
