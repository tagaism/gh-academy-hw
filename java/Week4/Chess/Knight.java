package Week4.Chess;

public class Knight extends Piece{
    // Implement knight-specific movement
    public Knight(int x, int y, String color) {
        super(x, y, color);
    }

    public String name() {
        return getColor() + " knight";
    }

    public String show() {
        return this.isWhite() ? "\u2658" : "\u265E";
    }

    public boolean canMove(int nx, int ny) {
        if(!this.isInBoard(ny, nx)) {
            return false;
        }
        int[] dx = new int[] {1,   2, 2, 1, -1, -2, -2, -1};
        int[] dy = new int[] {-2, -1, 1, 2,  2,  1, -1, -2};
        
        for(int i = 0; i < 8; i++) {
            if(this.x + dx[i] == nx && this.y + dy[i] == ny) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return false;
    }
}
