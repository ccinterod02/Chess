public class Game {

    private Player[] players;
    private ChessBoard chessBoard;

    public Game() {
        chessBoard = new ChessBoard();
        players[0] = new WhitePlayer();
        players[1] = new BlackPlayer();
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
        int player = 1;
        
        do {
            if (player == 1) {
                player = 0;
            }
            else {
                player = 1;
            }
            this.chessBoard.display();
            this.players[player].move(chessBoard);
        } while (!this.players[player].hasMate());
    }
}