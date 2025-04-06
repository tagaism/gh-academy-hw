// package Week3.Chocolate;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if((k % m == 0) || (k % n == 0)) {
            if(k < n * m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
