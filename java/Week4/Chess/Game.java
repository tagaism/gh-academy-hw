package Week4.Chess;

public class Game {
    private Game theGame;
    private Piece[][] board = new Piece[8][8];
    public Game() {
        if(this.theGame == null) {
            this.theGame = new Game();
        }
    }

    public void printBoard() {

    }
}
