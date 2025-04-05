// package Week3.SumOfDigitsOfThree;

import java.util.Scanner;

public class SumOfDigitsOfThree {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 10;
        int b = Math.round(n / 10) % 10;
        int c = Math.round(n / 100) % 10;
        System.out.println(a + b + c);
        sc.close();
    }
}
