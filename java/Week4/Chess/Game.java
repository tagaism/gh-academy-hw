package Week4.Chess;

public class Game {
    private static Game theGame;
    private Piece[][] board = new Piece[8][8];

    private Game() {
        // for(int q = 0; q < 4; q++) {
        //     String color = q < 2 ? "black" : "white";
        //     for(int i = 0; i < 4; i++) {

        //     }
        // }

        this.board[0][0] = new Rook(0, 0, "black");
        this.board[0][1] = new Knight(0, 1, "black");
        this.board[0][2] = new Bishop(0, 2, "black");
        this.board[0][3] = new Queen(0, 3, "black");
        this.board[0][4] = new King(0, 4, "black");
        this.board[0][5] = new Bishop(0, 5, "black");
        this.board[0][6] = new Knight(0, 6, "black");
        this.board[0][7] = new Rook(0, 7, "black");
        for(int i = 0; i < 8; i++) {
            this.board[1][i] = new Pawn(1, i, "black");
        }
        for(int i = 2; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                this.board[i][j] = new EmptyPiece(i, j, "");
            }
        }
        for(int i = 0; i < 8; i++) {
            this.board[6][i] = new Pawn(1, i, "white");
        }
        this.board[7][0] = new Rook(7, 0, "white");
        this.board[7][1] = new Knight(7, 1, "white");
        this.board[7][2] = new Bishop(7, 2, "white");
        this.board[7][3] = new Queen(7, 3, "white");
        this.board[7][4] = new King(7, 4, "white");
        this.board[7][5] = new Bishop(7, 5, "white");
        this.board[7][6] = new Knight(7, 6, "white");
        this.board[7][7] = new Rook(7, 7, "white");
    }

    public static Game getInstance() {
        if(theGame == null) {
            theGame = new Game();
        }
        return theGame;
    }

    public void printBoard() {
        System.out.print("    ");
        for(char c = 97; c < 105; c++) {
            System.out.printf("%c   ", c);
        }
        System.out.println();
        System.out.println("  +---+---+---+---+---+---+---+---+");
        for(int r = 0; r < 8; r++) {
            System.out.printf("%d | ", r + 1);
            for(Piece p : board[r]) {
                System.out.printf("%s | ", p.show());
            }
            System.out.println();
            System.out.println("  +---+---+---+---+---+---+---+---+");
        }
    }
}
