package Week3.Mkad;

import java.util.Scanner;

public class Mkad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int yamanote = 109;
        int point;
        if(v == 0 || t == 0) {
            point = 0;
        } else if(v > 0) {
            point = v * t % yamanote;
        } else {
            point = yamanote - Math.abs(v * t) % yamanote;
        }
        System.out.println(point);
        sc.close();
    }
}