package Kryptoanalyse;

public class NamePosition {
    String name;
    Liste<Integer> positions;

    NamePosition(String name, Liste<Integer> positions) {
        this.name = name;
        this.positions = positions;
    }

    public Liste<Integer> calcEntfs() {
        Liste<Integer> entfs = new Liste<Integer>();
        for (int i = 0; i < positions.length - 1; i++) {
            entfs.addIfNotIn((positions.get(i) - positions.get(i + 1)));
        }
        return entfs;
    }
}
