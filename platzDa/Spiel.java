package platzDa;

import java.util.Scanner;
import snake.Schlange;

public class Spiel {

    private int _breite;
    private Schlange<Person> _stamm = new Schlange<Person>();
    private Scanner _s = new Scanner(System.in);

    Spiel(int kinderzahl) {
        this._breite = kinderzahl;
    }

    private Person _leseString() {
        return new Person(_s.nextLine());
    }

    public void startBelegungEingabe() {
        for (int i = 0; i < this._breite; i++) {
            System.out.print("Gib einen Namen ein: ");
            this._stamm.fügeHinzu(this._leseString());
        }
    }

    public boolean tippIstRichtig(Person tipp) {
        if (this._stamm.entferne().name.equals(tipp.name)) {
            return true;
        } else {
            return false;
        }
    }

    public void spielen() {
        this.startBelegungEingabe();
        System.out.println(this._stamm);
        this._spielzug();

    }

    private void _spielzug() {

        System.out.print("Was ist das erste Kind?: ");
        if (tippIstRichtig(this._leseString())) {
            System.out.println("Richtig!");
            System.out.print("Gebe eine weiteres Kind an: ");
            this._stamm.fügeHinzu(this._leseString());
            this._spielzug();
        } else {
            System.out.println("Falsch!");
            System.out.println("Beginne ein neues Spiel!");
            this._stamm.loescheAlles();
            this.spielen();

        }
    }

}
