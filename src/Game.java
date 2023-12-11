import java.util.ArrayList;

public class Game {

    private Player[] players;
    private ChessBoard chessBoard;

    public Game() {
    }

    public boolean isResumed() {
        String answer;
        Console console = new Console();

        do {
            answer = console.readString("¿Do you want to play the rematch? (y/n): ");
        } while (!answer.equals("y") && !answer.equals("Y") && !answer.equals("n") && !answer.equals("N"));
        return answer.equals("y") || answer.equals("Y");
    }

    public void play() { 
        int playerIndex = 1;
        
        ArrayList<Piece> blackPieces = new ArrayList<Piece>(16);
        ArrayList<Piece> whitePieces = new ArrayList<Piece>(16); 
        
        chessBoard = new ChessBoard(whitePieces, blackPieces);
        players[0] = new WhitePlayer(whitePieces);
        players[1] = new BlackPlayer(blackPieces);

        
        do {

            if (playerIndex == 1) {
                playerIndex = 0;
            }
            else {
                playerIndex = 1;
            }

            this.chessBoard.display();
            this.players[playerIndex].move(chessBoard);
        } while (!this.players[playerIndex].hasMate());

        new Console().println("Congratulations!     Player " + players[playerIndex].getColor().getString() + "has won!");
    }
}