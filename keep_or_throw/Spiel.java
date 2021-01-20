package keep_or_throw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Stack.Stack;

public class Spiel {

    Stack<Karte> gemischt;
    Stack<Karte> keep;
    Stack<Karte> weg;
    private Scanner s = new Scanner(System.in);

    Spiel(int size) {
        Random r = new Random();
        System.out.println("Hallo, das Spiel 'Keep or throw' beginnt!");
        gemischt = new Stack<Karte>();

        // Ausgabe des gemischten Stapels

        keep = new Stack<Karte>();
        weg = new Stack<Karte>();

        // Zufällige Reihenfolge erzeugen
        ArrayList<Integer> alle = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            alle.add(i);
        }

        for (int i = 0; i < size; i++) {
            int random = r.nextInt(size - i);
            gemischt.push(new Karte(alle.get(random)));
            alle.remove(random);
        }

        // Start
        System.out.println("Gemischter Stapel: " + gemischt);
        while (this.betrachteNaechseKarte()) {
            if (!validate()) {
                System.out.println("Die nächste Karte " + gemischt.peek() + " ist zu groß und wird abgeworfen");
                this.wegwerfen();
            } else {

                System.out.println("Behalten oder wegwerfen? [1, 2]");
                int input = this.s.nextInt();
                if (input == 1) {
                    behalten();
                } else if (input == 2) {
                    wegwerfen();
                } else {
                    System.out.println("Gib entweder 1 oder 2 ein!");
                }
            }
        }
        this.auswerten();

    }

    public boolean betrachteNaechseKarte() {
        Karte aktuelleKarte = this.gemischt.peek();
        if (aktuelleKarte != null) {
            System.out.println("Karte: " + aktuelleKarte);
            return true;
        } else {
            System.out.println("Der gemischte Stapel ist leer. Das Spiel ist zu Ende");
            return false;
        }

    }

    public void behalten() {
        this.keep.push(this.gemischt.pop());
    }

    public void wegwerfen() {
        this.weg.push(this.gemischt.pop());

    }

    private boolean validate() {
        if (this.keep.peek() == null || this.keep.peek().zahl < this.gemischt.peek().zahl) {
            return true;
        }
        return false;
    }

    public void auswerten() {
        System.out.println("Behaltene Karten: " + keep);
        System.out.println("Weggeworfene Karten: " + weg);

    }

}
