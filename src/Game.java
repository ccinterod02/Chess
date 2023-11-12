public class Game {

    private Player[] players;
    private ChessBoard chessBoard;

    public Game() {
        for (int i = 0; i < 2; i++) {
            players[i] = new Player(Color.values()[i]);
        }
        chessBoard = new ChessBoard();
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
        int i = 1;

        do {
            this.chessBoard.display();
            if (i == 0) {
                i = 1;
            }
            else {
                i = 0;
            }
            this.players[i].move();
        } while (!this.players[i].hasWon());
    }

}
