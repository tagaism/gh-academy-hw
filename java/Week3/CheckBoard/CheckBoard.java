// package Week3.CheckBoard;

import java.util.Scanner;

public class CheckBoard {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // in n != 1, then to formula is n = 4s - 4; where s is sxs board;
        if(n == 1) {
            System.out.println("YES");
        } else {
            if((n + 4) % 4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
