package Week4.Chess;

public class Pawn extends Piece{
    // Implement pawn-specific movement

    public Pawn(int x, int y, String color) {
        super(x, y, color);
    }

    public boolean canMove(int newX, int newY) {
        // x: 1, y: 4
        // nx: 1, ny: 3
        return Math.abs(newY - this.y) == 1;
    }
}
