package Week4.Chess;

public class Main {
    public static void main(String[] args) {
        Knight k1 = new Knight(4, 4, "white");

        // p -> q 
        System.out.println(k1.canMove(5, 2));
        System.out.println(k1.canMove(6, 3));
        System.out.println(k1.canMove(6, 5));
        System.out.println(k1.canMove(5, 6));
        System.out.println(k1.canMove(3, 6));
        System.out.println(k1.canMove(2, 5));
        System.out.println(k1.canMove(2, 3));
        System.out.println(k1.canMove(3, 2));

        System.out.println(k1.canMove(1, 4));
        System.out.println(k1.canMove(2, 4));
    }
}
