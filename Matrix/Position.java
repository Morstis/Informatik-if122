package Matrix;

public class Position {
    public int y;
    public int x;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return " y=" + this.y + " " + "x=" + this.x;
    }
}
