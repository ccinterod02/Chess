
public class Piece {

    Coordinate position;
    Color color;

    public Piece(int col, int row, Color color) {
        position = new Coordinate(row, col);
    }

    public Piece(String str, Color color) {
        position = new Coordinate(str);
    }

    public void setPosition(Coordinate newPosition) {
        position = newPosition;
    }

    public Coordinate getPosition() {
        return null;
    }

    public boolean canMove(ChessBoard chessBoard, Coordinate newSquare) {
        return false;
    }

    public String getInitialLetter() {
        return null;
    }

    public Color getColor() {
        return color;
    }
}
