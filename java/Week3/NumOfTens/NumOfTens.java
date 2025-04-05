// package Week3.NumOfTens;

import java.util.Scanner;

public class NumOfTens {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Math.round(n / 10));
        sc.close();
    }
}
