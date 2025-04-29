package Week4.Chess;

public class Rook extends Piece{
    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    public String name() {
        return getColor() + " rook";
    }

    public boolean canMove(int nx, int ny) {
        if((this.x == nx && this.y == ny) || !this.isInBoard(ny, nx)) {
            return false;
        }
        if(this.x - nx == 0 && this.y - ny != 0) {
            return true;
        }

        if(this.x - nx != 0 && this.y - ny == 0) {
            return true;
        }
        return false;
    }

    public String show() {
        return isWhite() ? "\u2656" : "\u265C";
    }

    public boolean isEmpty() {
        return false;
    }
}
