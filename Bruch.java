public class Bruch {

    private int _zähler;
    private int _nenner;

    public Bruch(int zähler, int nenner) throws Exception {
        if (nenner == 0) {
            throw new Exception("Nenner darf nicht Null sein");
        }
        this._zähler = zähler;
        this._nenner = nenner;
        this.kürzen();
    }

    public Bruch subtract(Bruch bruch) {
        return this._strichrechnung(bruch, -1);
    }

    public Bruch add(Bruch bruch) {
        return this._strichrechnung(bruch, 1);
    }

    private Bruch _strichrechnung(Bruch bruch, int action) {
        int gemeinsamerTeiler = bruch._nenner * this._nenner;
        int newZähler = this._zähler * bruch._nenner * action + this._nenner * bruch._zähler;
        try {
            return new Bruch(newZähler, gemeinsamerTeiler);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public double decimal() {
        return (double) this._zähler / (double) this._nenner;
    }

    public String toString() {
        return this._zähler + "/" + this._nenner;
    }

    // Euklidischer Algorithmus
    // Referenz: https://de.wikipedia.org/wiki/Euklidischer_Algorithmus
    private int _ggT(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return _ggT(b, a % b);
        }
    }

    public void kürzen() {
        int ggT = _ggT(this._zähler, this._nenner);
        this._nenner = this._nenner / ggT;
        this._zähler = this._zähler / ggT;
    }

}
