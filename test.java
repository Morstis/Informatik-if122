
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int b = 0;
        int max = s.nextInt();
        for (int a = 1; a <= max; a++) {
            b = b + a;
        }

        System.out.print(b);
    }
}
