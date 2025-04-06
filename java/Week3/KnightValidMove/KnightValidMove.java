// package Week3.KnightValidMove;

import java.util.Scanner;

public class KnightValidMove {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(r1 - 2 == r2 && c1 + 1 == c2) {// 1
            System.out.println("YES");
        } else if(r1 - 1 == r2 && c1 + 2 == c2) {//2
            System.out.println("YES");
        } else if(r1 + 1 == r2 && c1 + 2 == c2) {//4
            System.out.println("YES");
        } else if(r1 + 2 == r2 && c1 + 1 == c2) {//5
            System.out.println("YES");
        } else if(r1 + 2 == r2 && c1 - 1 == c2) {//7
            System.out.println("YES");
        } else if(r1 + 1 == r2 && c1 - 2 == c2) {//8
            System.out.println("YES");
        } else if(r1 - 1 == r2 && c1 - 2 == c2) {//10
            System.out.println("YES");
        } else if(r1 - 2 == r2 && c1 - 1 == c2) {//11
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // String ans = "NO";
        // if((r1 + 2 == r2 || r1 - 2 == r2) && (c1 + 1 == c2 || c1 - 1 == c2)) {
        //     ans = "YES";
        // } else if((r1 + 1 == r2 || r1 - 1 == r2) && (c1 + 2 == c2 || c1 - 2 == c2)) {
        //     ans = "YES";
        // } else {
        //     ans = "NO";
        // }
        // System.out.println(ans);
        sc.close();
    }
}
