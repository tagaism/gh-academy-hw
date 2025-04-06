// package Week3.SumOfSquares;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        while(n > 0) {
            s += Math.pow(n, 2);
            n--;
        }
        System.out.println(s);
        sc.close();
    }
}
