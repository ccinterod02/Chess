import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Piece> pieces;
    Color color;

    public Player() {
        pieces = new ArrayList<Piece>();
    }

    public void move(ChessBoard chessBoard) {
        Console console = new Console();
        String answer;
        Piece actualPiece;
        Coordinate newSquare;
        
        do {
            do {
                answer = console.readString("¿Next move?: (cf,cf)");
            } while (!this.isValid(answer));

            newSquare = new Coordinate(answer.split(",")[1]);
            actualPiece = this.getActualPiece(answer.split(",")[0]);

        } while (!this.isValidMove(chessBoard, actualPiece, newSquare));
        chessBoard.move(actualPiece, newSquare);

    }

    private Piece getActualPiece(String strPosition) {
        
        for (Piece piece : pieces) {
            if (piece.getPosition() == new Coordinate(strPosition)) {
                return piece;
            }
        }
        return null;
    }

    private boolean isValidMove(ChessBoard chessBoard, Piece actualPiece, Coordinate newSquare) {
        Console console = new Console();
        
        if (actualPiece == null) {
            console.println("There is no piece on that square.");
            return false;
        }

        if (!actualPiece.canMove(chessBoard, newSquare)) {
            console.println("You can't do this move.");
            return false;
        }

        return true;
    }

    private boolean isValid(String str) {
        if (!str.matches("[a-h][1-8],[a-h][1-8]")) {
            new Console().println("Bad format.  (cf,cf)");
            return false;
        }
        return true;
    }

    public boolean hasMate() {
        return false;
    }

    public Color getColor() {
        return color;
    }

}