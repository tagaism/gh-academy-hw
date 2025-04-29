package Week4.Chess;

public class EmptyPiece extends Piece{
    protected EmptyPiece(int x, int y, String color) {
        super(x, y, color);
    }
    protected String name() {
        return "X";
    }
    protected String show() {
        return " ";
    }

    protected boolean isEmpty() {
        return true;
    }

    protected boolean canMove(int nx, int ny) {
        return false;
    }
}
