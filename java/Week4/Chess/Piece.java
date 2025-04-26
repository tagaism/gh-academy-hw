package Week4.Chess;

public abstract class Piece {
    // Common attributes and methods
    // black colored pieces start from the bottom of the board (from 7);
    // White colored pieces start from the top of the board (from 0);
    protected int x;
    protected int y;
    protected String color;
    protected Piece(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
