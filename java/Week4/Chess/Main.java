package Week4.Chess;

public class Main {
    public static void main(String[] args) {
        // Knight k1 = new Knight(4, 4, "white");
        // Pawn p1 = new Pawn(1, 1, "white");
        // Knight k2 = new Knight(2, 2, "black");
        // King K1 = new King(4, 4, "white");

        // System.out.println(k1);
        // System.out.println(p1);
        // System.out.println(k2);

        Game g = Game.getInstance();
        Game g1 = Game.getInstance();

        if(g == g1) {
            System.out.println("SAME GAME IS IN PROGRESS!!");
        }

        g.printBoard();
        
    }
}
