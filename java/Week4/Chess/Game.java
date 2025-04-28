package Week4.Chess;

public class Game {
    private static Game theGame;
    private static Piece[][] board;

    private Game() {}

    public static Game getInstance() {
        if(theGame == null) {
            theGame = new Game();
            buildBoard();
        }
        return theGame;
    }

    private static void buildBoard() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                board[i][j] = new EmptyPiece(i, j, "");
            }
        }
    }

    public void printBoard() {
        for(int r = 0; r < 8; r++) {
            for(Piece p : board[r]) {
                System.out.print(p.show());
            }
            System.out.println();
        }
    }
}
