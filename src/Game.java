
public class Game {

    private WhitePlayer whitePlayer;
    private BlackPlayer blackPlayer;
    private ChessBoard chessBoard;

    public Game() {
        whitePlayer = new WhitePlayer();
        blackPlayer = new BlackPlayer();
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
        do {
            // refactorizar los player para que se use el polimorfismo
        } while (!whitePlayer.hasWon() && !blackPlayer.hasWon());
    }

}
