package Week3.SquaresInRange;

import java.util.Scanner;

public class SquaresInRange {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i <= b; i++) {
            System.out.println("oueter");
            for(int j = 1; j <= i; j++) {
                System.out.println("inner");
                if(j * j == i) {
                    System.out.print(i + " ");
                    j = i + 1;
                }
            }
        }
        sc.close();
    }
}
