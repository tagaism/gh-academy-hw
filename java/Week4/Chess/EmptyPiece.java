package Week4.Chess;

public class EmptyPiece extends Piece{
    public EmptyPiece(int x, int y, String color) {
        super(x, y, color);
    }
    public String name() {
        return "X";
    }
    public String show() {
        return "×";
    }
    public boolean canMove(int nx, int ny) {
        return false;
    }
}
