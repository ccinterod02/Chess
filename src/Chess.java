public class Chess {
    public static void main(String[] args) throws Exception {
        new Chess().play();
    }

    private void play() {
        Game game;
        do {
            game = new Game();
            game.play();
        } while (game.isResumed());
    }
}
