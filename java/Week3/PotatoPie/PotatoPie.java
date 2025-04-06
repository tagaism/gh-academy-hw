// package Week3.PotatoPie;

import java.util.Scanner;

public class PotatoPie {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int kops = a * 100 + b;
        int total_in_kops = n * kops;
        System.out.printf("%d %d%n", total_in_kops / 100, total_in_kops % 100);
        sc.close();
    }
}
