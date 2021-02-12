package Caeser;

import java.util.Scanner;

public class Caeser {
    public String verschluessen(String wort, int verschiebung) {
        wort = wort.toUpperCase();
        String verschluesselt = "";
        for (int i = 0; i < wort.length(); i++) {
            verschluesselt += (char) (((int) wort.charAt(i) - 65 + verschiebung) % 26 + 65);
        }
        return verschluesselt;
    }

    public String entschluesseln(String wort, int verschiebung) {
        wort = wort.toUpperCase();
        String entschluesselt = "";
        for (int i = 0; i < wort.length(); i++) {
            entschluesselt += (char) (((int) wort.charAt(i) - 65 - verschiebung) % 26 + 65);
        }
        return entschluesselt;
    }

    public int[] haeufigkeitsanalyse(String text) {
        int[] x = new int[255];

        for (char ch : text.toCharArray()) {
            x[(int) ch]++;
        }
        return x;
    }

    public int checkForRange() {
        Scanner s = new Scanner(System.in);
        System.out.print("Gib die Zahl der Verschiebung an [0-25]: ");
        int input = s.nextInt();
        if (input > 0 && input < 25) {
            return input;
        } else {
            return checkForRange();
        }
    }
}
