package Week4.Chess;

public class Pawn extends Piece{
    // Implement pawn-specific movement
    public Pawn(int x, int y, String color) {
        super(x, y, color);
    }

    public String name() {
        return "Pawn";
    }

    public String show() {
        return this.isWhite() ? "\u2659" : "\u265F";
    }

    public boolean canMove(int nx, int ny) {
        if(!this.isInBoard(ny, nx)) {
            return false;
        }
        if(this.x == nx && this.y == ny) {
            return false;
        }
        int initialY = this.isWhite() ? 6 : 1;
        boolean isFirstMove = this.y == initialY;
        int step = isFirstMove ? 2 : 1;
        if(this.isWhite()) {
            //the initial position of white pawn is 6th row 
            return Math.abs(this.y - ny) <= step;
        } else {
            //the initial position of white pawn is 1st row 
            return Math.abs(ny - this.y) <= step;
        }
    }
}
