package Week4.Chess;

public class King extends Piece{
    public King(int x, int y, String color) {
        super(x, y, color);
    }

    public String name() {
        return getColor() + " king";
    }

    public boolean canMove(int nx, int ny) {
        int[] dx = new int[]{1, 1, 1, 0, -1, -1, -1, 0};
        int[] dy = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
        for(int i = 0; i < 8; i++) {
            if(this.x + dx[i] == nx && this.y + dy[i] == ny) {
                return true;
            }
        }
        return false;
    }

    public String show() {
        return isWhite() ? "\u2654" : "\u265A";
    }

    public boolean isEmpty() {
        return false;
    }
}
