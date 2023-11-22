
public class Coordinate {

    int row;
    int col;

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Coordinate(String str) {
        this.row = Character.getNumericValue(str.charAt(1));
        this.col = str.charAt(0) - 64;
    }

    public Coordinate(int row, char col) {
        this.row = row;
        this.col = col - 64;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

}
