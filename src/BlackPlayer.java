
public class BlackPlayer extends Player {

    public BlackPlayer() {
        super();
        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(i,6));
        }
        pieces.add(new Knight(1, 7));
        pieces.add(new Knight(6, 7));
        pieces.add(new Rook(0, 7));
        pieces.add(new Rook(7, 7));
    }
}
