// package Week3.CanRookBeat;

import java.util.Scanner;

public class CanRookBeat {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int rook_r = sc.nextInt();
        int rook_c = sc.nextInt();
        int other_r = sc.nextInt();
        int other_c = sc.nextInt();
        if(rook_r == other_r || rook_c == other_c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
