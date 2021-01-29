package Menge;

import java.util.Random;

import Stack.Stack;

public class Main {
    public static void main(String[] args) {
        Menge<Integer> m = new Menge<Integer>();
        for (int i = 0; i < 100; i++) {
            m.add(i);
        }

        Stack<Integer> s = new Stack<Integer>();

        // Es folgt die allerschlimmst Shuffle Methode, die ich je gebaut
        // habe und bauen werde... Schlimmer geht es fast nicht.
        Random r = new Random();
        while (s.size < 100) {
            int random = r.nextInt(100);
            if (m.contains(random)) {
                s.push(random);
                m.remove(random);
            }

        }

        System.out.println(s);

    }

}
