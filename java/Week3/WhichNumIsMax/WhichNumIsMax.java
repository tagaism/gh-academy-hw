// package Week3.WhichNumIsMax;

import java.util.Scanner;

public class WhichNumIsMax {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b) {
            System.out.println(0);
        } else if(a > b) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        sc.close();
    }
}
