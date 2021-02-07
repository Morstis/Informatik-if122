package Zeichenkettenverarbeitung;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String x = "Informatik";
        System.out.println("Text: " + x);
        System.out.println("Der Text enthält: " + x.length() + " Buchstaben");
        char c = x.charAt(2);
        System.out.println("Das dritte Zeichen lautet: " + c);
        if (x.indexOf("o") > -1) {
            System.out.println("Position von o: " + x.indexOf("o"));
        } else {
            System.out.println("o ist nicht vorhanden");
        }
        String out = "";

        for (int i = 0; i < x.length(); i++) {

            out += i % 2 != 0 ? x.charAt(i) : Character.toUpperCase(x.charAt(i));

        }
        System.out.println(out);

        Random r = new Random();
        System.out.println(x.charAt(r.nextInt(x.length())));

        System.out.println("######### - Spiel - #########");

        String[] randomStrings = new String[] { "apfel", "banane", "erbse", "kuchen", "random", "spiel", "baum",
                "reden", "schreiben", "essen", "laufen", "arbeiten", "gehen", "birne", "obst", "gemüse", "rennen",
                "uhrzeit", "fisch", "fischen", };

        String randomString = randomStrings[r.nextInt(randomStrings.length)];
        System.out.println(randomString);

        char[] unerraten = randomString.replaceAll(".", "_").toCharArray();
        char[] wort = randomString.toCharArray();

        Scanner s = new Scanner(System.in);
        int versuche = 0;
        while (contains(unerraten, '_')) {
            for (char d : unerraten) {
                System.out.print(d + " ");
            }
            System.out.print("\n");

            System.out.print("Rate einen Buchstaben: ");
            char buchstabe = s.next().toLowerCase().toCharArray()[0];
            for (int i = 0; i < wort.length; i++) {
                if (wort[i] == buchstabe) {
                    unerraten[i] = wort[i];
                }
            }
            versuche++;
        }

        System.out.println("Fertig! Das Wort war: " + randomString);
        System.out.println("Du hast: " + versuche + " Versuche gebraucht.");

        s.close();

    }

    public static boolean contains(char[] input, char filter) {
        for (char d : input) {
            if (d == filter) {
                return true;
            }
        }
        return false;
    }

}
