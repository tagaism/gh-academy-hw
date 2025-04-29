package Week4.Chess;

public class Bishop extends Piece {
    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }
    
    public String name() {
        return getColor() + " bishop";
    }

    public boolean canMove(int nx, int ny) {
        if((this.x == nx && this.y == ny) || !this.isInBoard(ny, nx)) {
            return false;
        }
        if(this.x - nx == this.y - ny) {
            return true;
        }
        return false;
    }

    public String show() {
        return isWhite() ? "\u2657" : "\u265D";
    }

    public boolean isEmpty() {
        return false;
    }
}
