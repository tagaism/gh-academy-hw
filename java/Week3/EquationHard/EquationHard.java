// package Week3.EquationHard;

import java.util.Scanner;

public class EquationHard {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        //( ax + b ) : ( cx + d ) = 0
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a == 0 && b == 0) {
            System.out.println("INF");
        } else if((a == 0 && c == 0) || (a == b) && (c == d) || (a == c) && (b == d)) {
            System.out.println("NO");
        } else {
            int x1 = -b / a;
            int x2 = -d / c;
            if(a * x1 == -b) {
                System.out.println(x1);
            } else if(c * x2 == -d) {
                System.out.println(x2);
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
