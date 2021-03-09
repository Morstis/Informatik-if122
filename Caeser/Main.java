package Caeser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Caeser c = new Caeser();

        System.out.print("Verschlüsseln oder Entschlüsseln? [1/2]: ");
        int input = s.nextInt();
        if (input == 1) {
            int verschiebung = c.checkForRange();
            System.out.print("Gib das Wort an, das du verschlüsseln möchtest: ");
            System.out.println(c.verschluessen(s.next(), verschiebung));
        } else if (input == 2) {
            int verschiebung = c.checkForRange();
            System.out.print("Gib das Wort an, das du entschlüsseln möchtest: ");
            System.out.println(c.entschluesseln(s.next(), verschiebung));
        } else {
            System.out.println("Gib entweder 1 oder 2 ein");
        }
        System.out.println("Gib einen Text an: ");
        int[] out = c.haeufigkeitsanalyse(s.next());

        for (int i = 0; i < out.length; i++) {

            System.out.print((char) i + ": " + out[i] + "\t");
        }
        s.close();
    }

}
