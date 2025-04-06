//package Week3.SignX;

import java.util.Scanner;

public class SignX {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0) {
            System.out.println(0);
        } else if(x > 0) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}
