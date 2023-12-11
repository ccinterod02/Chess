import java.util.ArrayList;

public class ChessBoard {

    Piece[][] board;
    ArrayList<Piece> whitePieces;
    ArrayList<Piece> blackPieces;

    public ChessBoard(ArrayList<Piece> whitePieces, ArrayList<Piece> blackPieces) {
        this.whitePieces = whitePieces;
        this.blackPieces = blackPieces;
        board = new Piece[8][8];
        this.fillBoard(whitePieces, blackPieces);
    }

    private void fillBoard(ArrayList<Piece> whitePieces, ArrayList<Piece> blackPieces) {
        for (Piece piece : whitePieces) {
            assert(board[piece.getPosition().getRow()][piece.getPosition().getCol()] != null);
            board[piece.getPosition().getRow()][piece.getPosition().getCol()] = piece;
        }
        for (Piece piece : blackPieces) {
            assert(board[piece.getPosition().getRow()][piece.getPosition().getCol()] != null);
            board[piece.getPosition().getRow()][piece.getPosition().getCol()] = piece;
        }
    }

    public void display() {
        Console console = new Console();
        
        console.println("  a b c d e f g h");
        for (int i = 0; i < 8; i++) {
            console.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    console.print(board[i][j].getInitialLetter() + " ");
                } else {
                    console.print("- ");
                }
            }
            console.println(8 - i);
        }
        console.println("  a b c d e f g h");
    }

    public void move(Piece actualPiece, Coordinate newSquare) {

        Piece posiblePiece = board[newSquare.getRow()][newSquare.getCol()];
        if (posiblePiece != null) {
            if (this.matchArray(posiblePiece) == whitePieces) {
                blackPieces.remove(posiblePiece);
            }
            else {
                whitePieces.remove(posiblePiece);
            }
        }
        // a ver como movemos las piezas
        board[newSquare.getRow()][newSquare.getCol()] = actualPiece;
        board[actualPiece.getPosition().getRow()][actualPiece.getPosition().getCol()] = null;
        actualPiece.setPosition(newSquare);
    }

    private ArrayList<Piece> matchArray(Piece piece) {
        for (Piece indexPiece : whitePieces) {
            if (indexPiece == piece) {
                return whitePieces;
            }
        }
        for (Piece indexPiece : blackPieces) {
            if (indexPiece == piece) {
                return blackPieces;
            }
        }

        return null;
    }
}

