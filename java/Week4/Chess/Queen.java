package Week4.Chess;

public class Queen extends Piece {
    public Queen(int x, int y, String color) {
        super(x, y, color);
    }

    public String name() {
        return this.getColor() + " queen";
    }

    public boolean canMove(int nx, int ny) {
        if((this.x == nx && this.y == ny) || !this.isInBoard(ny, nx)) {
            return false;
        }
        if(this.x - nx == this.y - ny) {
            return true;
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
        return this.isWhite() ? "\u2655" : "\u265B";
    }

    public boolean isEmpty() {
        return false;
    }
}
