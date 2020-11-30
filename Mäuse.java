public class Mäuse {

    private int _jung;
    private int _erwachsen;
    private int _alt;
    private int _schritt = 0;

    Mäuse(int jung, int erwachen, int alt) {
        this._jung = jung;
        this._erwachsen = erwachen;
        this._alt = alt;
    }

    public int gibJung() {
        return this._jung;
    }

    public int gibErwachsen() {
        return this._erwachsen;
    }

    public int gibAlt() {
        return this._alt;
    }

    public int gibSchritt() {
        return this._schritt;
    }

    public void macheSchritt() {
        int neu_jung = this._erwachsen * 4 + this._alt * 2;
        this._erwachsen = this._jung / 2;
        this._alt = this._erwachsen / 3;
        this._jung = neu_jung;
        this._schritt++;
    }
}
