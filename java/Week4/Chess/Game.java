package Week4.Chess;

public class Game {
    private static Game theGame = null;
    private Piece[][] board = new Piece[8][8];
    Game() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                board[i][j] = new EmptyPiece(i, j, "");
            }
        }
    }

    // public static Game() {
    //     if(theGame == null) {
    //         theGame = new Game();
    //     }
    //     return theGame;
    // }

    public void printBoard() {
        for(int r = 0; r < 8; r++) {
            for(Piece p : this.board[r]) {
                System.out.print(p.show());
            }
            System.out.println();
        }
    }
}
