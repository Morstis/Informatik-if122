
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  static Scanner s = new Scanner(System.in);
  static int randomNumber;

  public static void main(String[] args) {

    int[] x = new int[] { 1, 2, 3 };

    ArrayList<String> y = new ArrayList<String>();
    System.out.println(y.iterator().next());
    // out("Aufgabe? [1-3]");
    // aufgabe();
  }

  private static int sum(int x, int y) {
    return x + y;
  }

  private static int addTillN(int n) {
    int x = 0;
    for (int i = 1; i <= n; i++) {
      x += i;
    }
    return x;
  }

  private static void out(Object input) {
    System.out.println(input);
  }

  private static void game() {

    out("Dein Rateversuch:");
    int x = s.nextInt();
    if (x == randomNumber) {
      out("Richtig!");
    } else if (x > randomNumber) {
      out("Zu groß");
      game();
    } else if (x < randomNumber) {
      out("Zu klein");
      game();
    } else {
      throw new Error("Jap Unmöglich, aber wer weiß");
    }

  }

  private static double randomInt(int max) {
    return Math.floor(Math.random() * (max - 1) + 1);
  }

  private static void aufgabe() {
    switch (s.nextInt()) {
      case 1:
        out("Gebe zwei Ganzzahlen hintereinander ein. Sie werden addiert");
        out("Das Ergebnis ist:" + sum(s.nextInt(), s.nextInt()));
        break;
      case 2:
        out(addTillN(s.nextInt()));
        break;
      case 3:
        out("Gib das Maximum ein:");
        randomNumber = (int) randomInt(s.nextInt());
        game();
        break;
      default:
        out("bitte gib eine Nummer von 1-3 an");
    }
    main(null);
  }

}