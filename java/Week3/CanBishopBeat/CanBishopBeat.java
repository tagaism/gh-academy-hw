// package Week3.CanBishopBeat;

import java.util.Scanner;

public class CanBishopBeat{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int bish_r = sc.nextInt();
        int bish_c = sc.nextInt();
        int othr_r = sc.nextInt();
        int othr_c = sc.nextInt();

        if(Math.abs(bish_r - othr_r) == Math.abs(bish_c - othr_c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
