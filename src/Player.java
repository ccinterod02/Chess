import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Piece> pieces;

    public Player() {
        pieces = new ArrayList<Piece>();
    }

    public void move(ChessBoard chessBoard) {
        Console console = new Console();
        String answer;
        do {
            answer = console.readString("¿Next move?: (cf,cf)");
        } while (!this.isValid(answer));

        

    }

    private boolean isValid(String str) {
        if (!str.matches("[a-h][1-8],[a-h][1-8]")) {
            new Console().println("Bad format.");
            return false;
        }
        return true;
    }

    public boolean hasMate() {
        return false;
    }

}