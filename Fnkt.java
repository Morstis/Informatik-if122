import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fnkt {

    public class Gleichung {
        private int grad;
        private int[] vorfaktoren;

        public Gleichung(String userInput) {
            String pattern = "(.*)(\\d+)(.*)";

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(userInput);

            System.out.println(m);

            Math.pow(1, 2);
        }
    }

    Fnkt(Gleichung gleichung) {

    }

}
