// package Week3.CanQueenBeat;

import java.util.Scanner;

public class CanQueenBeat {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int q_r = sc.nextInt();
        int q_c = sc.nextInt();
        int othe_r = sc.nextInt();
        int othe_c = sc.nextInt();

        if((q_r == othe_r || q_c == othe_c) || (Math.abs(q_c - othe_c) == Math.abs(q_r - othe_r))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
