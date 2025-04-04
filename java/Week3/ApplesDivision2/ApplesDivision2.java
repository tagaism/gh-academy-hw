// package Week3.ApplesDivision2;

import java.util.Scanner;

public class ApplesDivision2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(a % s);
        sc.close();
    }
}
