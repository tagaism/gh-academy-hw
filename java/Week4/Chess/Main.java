package Week4.Chess;

public class Main {
    public static void main(String[] args) {
        Knight k1 = new Knight(4, 4, "white");
        Pawn p1 = new Pawn(1, 1, "white");
        Knight k2 = new Knight(2, 2, "black");

        System.out.println(k1);
        System.out.println(p1);
        System.out.println(k2);
    }
}
