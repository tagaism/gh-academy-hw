// package Week3.NextNprevNumber;

import java.util.Scanner;

public class NextNprevNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        // System.out.printf("The next number for the number %d is %d.%n", n, n + 1);
        // System.out.printf("The next number for the number  The next previous for the number %d is %d.%n", n, n - 1);
        System.out.println("The next number for the number " + n + " is " + (n + 1) + ".");
        System.out.println("The previous number for the number " + n + " is " + (n - 1) + ".");
        sc.close();
    }
}