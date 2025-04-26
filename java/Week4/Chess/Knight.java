package Week4.Chess;

public class Knight extends Piece{
    // Implement knight-specific movement
    Knight(int x, int y, String color) {
        super(x, y, color);
    }

    public boolean canMove(int nx, int ny) {
        // x: 4, y: 4
        // nx: 5, ny: 2       1   2   3  4   5  6   7    8
        int[] dx = new int[] {1,  2,  2, 1, -1, -2, -2, -1};
        int[] dy = new int[] {-2, -1, 1, 2,  2,  1, -1, -2};
        
        for(int i = 0; i < 8; i++) {
            if(this.x + dx[i] == nx && this.y + dy[i] == ny) {
                return true;
            }
        }
        return false;
    }
}
