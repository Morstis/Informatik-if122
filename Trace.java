
public class Trace<T> {

    String[] _kopf;
    private boolean _active;

    public Trace(String[] kopf) {
        this._active = true;
        constructor(kopf);
    }

    public Trace(String[] kopf, boolean active) {
        this._active = active;
        if (active)
            constructor(kopf);
    }

    private void constructor(String[] kopf) {
        System.out.format("%5s", "Zeile\t");
        this._kopf = kopf;
        for (int i = 0; i < kopf.length; i++) {
            System.out.format("%" + this._kopf[i].length() + "s", kopf[i] + "\t");

        }
        System.out.println("");
    }

    void next(int Zeile, T[] value) {

        if (this._active == true) {
            System.out.print(Zeile + "\t");
            for (int i = 0; i < value.length; i++) {
                System.out.format("%" + this._kopf[i].length() + "s", value[i] + "\t");

            }
            System.out.println("");
        }

    }

}
