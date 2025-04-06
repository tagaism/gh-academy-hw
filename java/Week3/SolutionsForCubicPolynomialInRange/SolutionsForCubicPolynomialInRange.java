// package Week3.SolutionsForCubicPolynomialInRange;

import java.util.Scanner;

public class SolutionsForCubicPolynomialInRange {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        for(int i = 0; i <= 1000; i++) {
            int r = a * (int)Math.pow(i, 3) + b * (int)Math.pow(i, 2) + c * i;
            if(r == -d) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
