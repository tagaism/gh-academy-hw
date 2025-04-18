package Week3.ItertiveFactorial;

import java.util.Scanner;

public class IterativeFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long result = 1;
        while(n > 0) {
            System.out.println(n);
            result *= n;
            n--;
        }
        System.out.println(result);
    }
}
