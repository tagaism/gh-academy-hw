// package Week3.KingValidMove;

import java.util.Scanner;

public class KingValidMove {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int s_r = sc.nextInt();
        int s_c = sc.nextInt();
        int e_r = sc.nextInt();
        int e_c = sc.nextInt();
        if(s_r - 1 == e_r && s_c == e_c) {
            System.out.println("YES");
        } else if(s_r - 1 == e_r && s_c + 1 == e_c) {
            System.out.println("YES");
        } else if(s_r == e_r && s_c + 1 == e_c) {
            System.out.println("YES");
        } else if(s_r + 1 == e_r && s_c + 1 == e_c) {
            System.out.println("YES");
        } else if(s_r + 1 == e_r && s_c == e_c) {
            System.out.println("YES");
        } else if(s_r + 1 == e_r && s_c - 1 == e_c) {
            System.out.println("YES");
        } else if(s_r == e_r && s_c - 1 == e_c) {
            System.out.println("YES");
        } else if(s_r - 1 == e_r && s_c - 1 == e_c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // if((Math.abs(e_c = s_c) == 1 || (e_c - s_c == 0)) && (Math.abs(s_r - e_r) == 1) || (s_r - e_r) == 0) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }
        sc.close();
    }
}
