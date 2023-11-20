import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Piece> pieces;

    public Player() {
        pieces = new ArrayList<Piece>();
    }

    public void move(ChessBoard chessBoard) {
        Console console = new Console();
        String answer = console.readString("¿Next move?: (c,f c,f)");
    }

    public boolean hasMate() {
        return false;
    }

}