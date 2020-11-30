public class BruchMain {
    public static void main(String[] args) {
        try {
            Bruch b = new Bruch(24, 36);
            Bruch b2 = new Bruch(4, 5);
            _out(b);
            _out(b2.decimal());

            _out(b.subtract(b2));
            _out(b.add(b2));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void _out(Object o) {
        System.out.println(o);
    }
}
