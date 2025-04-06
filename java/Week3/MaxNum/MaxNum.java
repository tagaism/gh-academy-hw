// package Week3.MaxNum;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? a : b);
        sc.close();
    }
}
