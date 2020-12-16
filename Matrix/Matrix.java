package Matrix;

public class Matrix {

    /**
     * [ [1,2,3,5], [1,2,3,5], [2,3,4,5], [2,3,4,5], [1,2,4,5] ]
     */
    protected double[][] elem;

    Matrix(int sizeX, int sizeY) {
        this.elem = new double[sizeX][sizeY];

    }

    void set(Position position, double value) {
        this.elem[position.x][position.y] = value;
    }

    double get(Position position) {
        return this.elem[position.x][position.y];
    }

    int sizeX() {
        return this.elem.length;
    }

    int sizeY() {
        return this.elem[0].length;
    }

    @Override
    public String toString() {

        String x = "";

        for (int i2 = 0; i2 < this.sizeY(); i2++) {

            for (int i = 0; i < this.sizeX(); i++) {

                x += " | " + this.elem[i][i2];

            }
            x += " |\n";
        }

        return x;

    }
}
