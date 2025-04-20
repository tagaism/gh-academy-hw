package Week4.Chess.Pawn;

public class Pawn extends Piece{
    // Implement pawn-specific movement
    private boolean isFirstMove = true;
    Pawn(int x, int y, String color) {
        this.isWhite = color.equals("white");
        this.x = x;
        this.y = y;
    }
    public boolean canMove(int moveTox, int moveToy) {
        // First check color. Then takes new place on the board
        // and if it is white then check if it is legal to move down.
        // If it is black then checks if it is legal to move up.
        int moveStep = this.isFirstMove ? 2 : 1;
        if(moveTox > 7 || moveTox < 0 || moveToy > 7 || moveToy < 0) {
            //If new places are out of range of the board return False;
            return false;
        }
        if(this.isWhite) {
            return this.y + moveStep == moveToy && this.x == moveTox;
        } else {
            return this.y - moveStep == moveToy && this.x == moveTox;
        }
    }
    public boolean getIfFirstMove() {
        return this.isFirstMove;
    }
    public boolean canCapture(Piece other) {
        if(this.isWhite && !other.isWhite) {
            return ((this.x + 1 == other.x && this.y + 1 == other.y) || (this.x - 1 == other.x && this.y + 1 == other.y));
        } else {
            return ((this.x - 1 == other.x && this.y - 1 == other.y) || (this.x + 1 == other.x && this.y - 1 == other.y));
        }
    }
}
