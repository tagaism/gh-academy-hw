package Week4.Chess;

public abstract class Tail {
    protected int x, y;
    public Tail(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected abstract String name();

    protected abstract boolean canMove(int nx, int ny);

    protected abstract String show();

    protected abstract boolean isEmpty();
}
