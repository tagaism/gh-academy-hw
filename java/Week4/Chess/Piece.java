package Week4.Chess;

public abstract class Piece extends Tail {
    // Common attributes and methods
    // black colored pieces start from the bottom of the board (from 7);
    // White colored pieces start from the top of the board (from 0);
    protected String color;
    public Piece(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    protected abstract String name();

    protected abstract boolean canMove(int nx, int ny);

    protected abstract String show();

    protected abstract boolean isEmpty();

    protected String getColor() {
        return this.color;
    }

    protected void move(int nx, int ny) {
        if(canMove(nx, ny)) {
            this.x = nx;
            this.y = ny;
        }
    };

    protected boolean isWhite() {
        return this.color.equals("white");
    };

    protected boolean isInBoard(int ny, int nx) {
        if(ny < 0 || ny > 7) {
            return false;
        }
        if(nx < 0 || nx > 7) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s -> x: %d, y: %d, name: %s", this.show(), this.x, this.y, this.name());
    }
}
