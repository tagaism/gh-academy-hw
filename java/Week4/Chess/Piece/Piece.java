package Week4.Chess.Piece;

abstract class Piece {
    // Common attributes and methods
    // black colored pieces start from the bottom of the board (from 7);
    // White colored pieces start from the top of the board (from 0);
    int x;
    int y;
    boolean isWhite;
    public abstract boolean canMove(int moveTox, int moveToy);
}
