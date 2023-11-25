
public class Piece {

    Coordinate position;

    public Piece(int col, int row) {
        position = new Coordinate(row, col);
    }

    public Piece(String str){
        position = new Coordinate(str);
    }



    public Coordinate getPosition() {
        return null;
    }

    public boolean canMove(ChessBoard chessBoard, Coordinate newSquare) {
        return false;
    }}
