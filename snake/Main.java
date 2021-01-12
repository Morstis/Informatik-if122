package snake;

public class Main {
    public static void main(String[] args) {
        Schlange<Integer> s = new Schlange<Integer>();

        for (int i = 1; i <= 20; i++) {
            s.fügeHinzu(i);

        }
        System.out.println(s);
        System.out.println("Länge:" + s.gibLänge());

        System.out.println("Kopf: " + s.gibKopfDaten());

        System.out.println("Raus: " + s.entferne());

        System.out.println(s);
        System.out.println("Länge:" + s.gibLänge());
        System.out.println("Kopf: " + s.gibKopfDaten());
    }
}
