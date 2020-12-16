package Matrix;

public class GLS extends Matrix {

    GLS(int sizeX, int sizeY) {
        super(sizeX, sizeY);
    }

    public void multZeileMitFaktor(int zeile, double faktor) {
        for (int spalte = 0; spalte < sizeX(); spalte++) {
            this.elem[spalte][zeile] *= faktor;
        }
    }

    public void divZeileDurchDivisor(int zeile, double divisor) {
        for (int spalte = 0; spalte < sizeX(); spalte++) {
            this.elem[spalte][zeile] /= divisor;

        }

    }

    public void addiereZeileZuZeile(int zeile, int zuZeile) {
        for (int spalte = 0; spalte < sizeX(); spalte++) {
            this.elem[spalte][zeile] += this.elem[spalte][zuZeile];
        }

    }

    public void addiereVielfachesVonZeileZuZeile(double faktor, int zeile, int zuZeile) {
        for (int spalte = 0; spalte < sizeX(); spalte++) {
            this.elem[spalte][zeile] += this.elem[spalte][zuZeile] * faktor;
        }
    }

    public void wendeGaussAn() {

    }

}
