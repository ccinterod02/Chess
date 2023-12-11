import java.util.ArrayList;

public class WhitePlayer extends Player{

    public WhitePlayer(ArrayList<Piece> pieces) {
        super(pieces);
        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(i,6, color));
        }
        pieces.add(new Knight(1, 7, color));
        pieces.add(new Knight(6, 7, color));
        pieces.add(new Rook(0, 7, color));
        pieces.add(new Rook(7, 7, color));
    }

}
