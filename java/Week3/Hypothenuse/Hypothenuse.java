package Week3.Hypothenuse;

import java.util.Scanner;

public class Hypothenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        sc.close();
    }
}
