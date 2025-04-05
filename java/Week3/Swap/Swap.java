// package Week3.Swap;

import java.util.Scanner;

public class Swap {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
        sc.close();
    }
}
