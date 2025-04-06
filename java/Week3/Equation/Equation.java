// package Week3.Equation;

import java.util.Scanner;

public class Equation {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0) {
            System.out.println("NO");
        } else {
            int x = -b / a;
            if(a * x == -b) {
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
