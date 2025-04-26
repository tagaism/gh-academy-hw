package Week4.Chess;

public class Knight extends Piece{
    // Implement knight-specific movement
    Knight(int x, int y, String color) {
        // this.isWhite = color.equals("white");
        // this.x = x;
        // this.y = y;
        super(x, y, color);
    }

    public boolean canMove(int moveTox, int moveToy) {
        //takes new place on the board and return True if it 
        // is legal place ot move (L-shape). Otherwise returns False.
        int[] X = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        int[] Y = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
        if(moveTox > 7 || moveTox < 0 || moveToy > 7 || moveToy < 0) {
            //If new places are out of range of the board return False;
            return false;
        }
        for(int i = 0; i < 8; i++) {
            if(this.x + X[i] == moveTox && this.y + Y[i] == moveToy) {
                return true;
            }
        }
        return false;
    }
}
